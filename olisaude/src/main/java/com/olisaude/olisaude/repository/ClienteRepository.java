package com.olisaude.olisaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olisaude.olisaude.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
