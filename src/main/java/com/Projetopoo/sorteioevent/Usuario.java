package com.Projetopoo.sorteioevent;


import java.util.Set;
import com.Projetopoo.sorteioevent.NotaFiscal;

public class Usuario {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private Set<NotaFiscal> notaFiscais;
    private Set<Bilhete> bilhetes;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;

    }
    public Set<NotaFiscal> getNotaFiscais() {
        return notaFiscais;
    }

    public Set<Bilhete> getBilhetes() {
        return bilhetes;
    }

    // setters
    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;

    }

    public void setNotaFiscais(Set<NotaFiscal> notaFiscais){
        this.notaFiscais = notaFiscais;
    }
    public void setBilhetes(Set<Bilhete> bilhetes){
        this.bilhetes = bilhetes;
    }

}
