package com.olisaude.olisaude.controller;

import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olisaude.olisaude.entity.Cliente;
import com.olisaude.olisaude.services.ClienteServices;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteServices clienteServices;

    public ClienteController(ClienteServices clienteServices) {
        this.clienteServices = clienteServices;
    }
    

    @PostMapping
    List<Cliente> create(@RequestBody Cliente cliente){
        return clienteServices.create(cliente);
    }
    @GetMapping
    List<Cliente> list(){
        return clienteServices.list();
    }
    @PutMapping
    List<Cliente> update(@RequestBody Cliente cliente){
        return clienteServices.update(cliente);
    }
    @DeleteMapping("{id}")
    List<Cliente> delete(@PathVariable("id") Long id){
        return clienteServices.delete(id);
    }

}
