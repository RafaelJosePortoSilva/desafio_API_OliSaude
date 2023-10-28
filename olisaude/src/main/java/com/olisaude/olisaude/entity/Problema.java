package com.olisaude.olisaude.entity;

import java.util.function.ToIntFunction;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Problema {
    
    public static ToIntFunction<? super Problema> getGrau;
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
