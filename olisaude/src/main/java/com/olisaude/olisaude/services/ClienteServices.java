package com.olisaude.olisaude.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.olisaude.olisaude.entity.Cliente;
import com.olisaude.olisaude.entity.Problema;
import com.olisaude.olisaude.repository.ClienteRepository;

@Service
public class ClienteServices {
    
    private ClienteRepository clienteRepository;

    public ClienteServices(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    public List<Cliente> list(){
        
        List<Cliente> clientes = clienteRepository.findAll();

        for(Cliente cliente : clientes){
            int somaDosGraus = cliente.getProblemas()
                .stream()
                .mapToInt(Problema.getGrau)
                .sum();
            cliente.setSomaDosGraus(somaDosGraus);

        }

        return clientes.stream()
            .sorted(Comparator.comparingInt(cliente -> -cliente.getSomaDosGraus()))
            .limit(10)
            .collect(Collectors.toList());
        
    }


    public List<Cliente> create(Cliente cliente){
        clienteRepository.save(cliente);
        return list();
    }

    public List<Cliente> update(Cliente cliente){
        clienteRepository.save(cliente);
        return list();
    }

    public List<Cliente> delete(Long id){
        clienteRepository.deleteById(id);
        return list();
    }
}
