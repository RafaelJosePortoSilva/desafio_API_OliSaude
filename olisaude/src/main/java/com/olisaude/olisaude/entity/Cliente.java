package com.olisaude.olisaude.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date nascimento;
    private String sexo;

    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Problema> problemas;

    public List<Problema> getProblemas() {
        return problemas;
    }
    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }
    
    private Date data_criacao;
    private Date data_atualizacao;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Date getData_criacao() {
        return data_criacao;
    }
    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }
    public Date getData_atualizacao() {
        return data_atualizacao;
    }
    public void setData_atualizacao(Date data_atualizacao) {
        this.data_atualizacao = data_atualizacao;
    }
    public void setSomaDosGraus(int somaDosGraus) {
    }
    public int getSomaDosGraus() {
        return 0;
    }

}
