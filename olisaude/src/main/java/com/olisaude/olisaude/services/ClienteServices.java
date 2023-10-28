package com.olisaude.olisaude.services;

import org.springframework.stereotype.Service;

import com.olisaude.olisaude.entity.Cliente;
import com.olisaude.olisaude.repository.ClienteRepository;

@Service
public class ClienteServices {
    
    private ClienteRepository clienteRepository;

    public ClienteServices(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente create(Cliente cliente){
        Cliente savedCliente = clienteRepository.save(cliente);
        return savedCliente;
    }

    public Cliente update(Cliente cliente){
        Cliente savedCliente = clienteRepository.save(cliente);
        return savedCliente;
    }

    public void delete(Long id){
        clienteRepository.deleteById(id);
    }

    


}
