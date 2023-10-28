package com.olisaude.olisaude.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Problema {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long grau;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId_cliente() {
        return grau;
    }
    public void setId_cliente(Long grau) {
        this.grau = grau;
    }

    public Long getGrau() {
        return grau;
    }
    public void setGrau(Long grau) {
        this.grau = grau;
    }

    
}
