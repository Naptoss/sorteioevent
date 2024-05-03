package com.Projetopoo.sorteioevent;
import java.util.Set;


public class Sorteio {
    private Long id;
    private Integer ano;
    private String descricao;
    private Set<Bilhete>bilhetes;

    // getters
    public Long getId(){
        return id;
    }

    public Integer getAno(){
        return ano;
    }
    public String getDescricao(){
        return descricao;
    }

    public Set<Bilhete> getBilhetes(){
        return bilhetes;
    }

    // setters
    public void setId(Long id){
        this.id = id;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setBilhetes(Set<Bilhete> bilhetes){
        this.bilhetes = bilhetes;
    }

}


