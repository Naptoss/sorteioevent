package com.Projetopoo.sorteioevent;
import java.util.Set;

public class NotaFiscal {

    private Long id;
    private String chave;
    private Set<Bilhete> bilhetes;
    private Usuario usuario;


    // getters

    public Long getId() {
        return id;
    }

    private String getChave() {
        return chave;
    }

    public  Set<Bilhete> getBilhetes() {
        return bilhetes;
    }

    // setters

    public void SetId(Long id) {
        this.id = id;
    }
    public void setChave(String chave){
        this.chave = chave;
    }
    public void setBilhetes(Set<Bilhete> bilhetes) {
        this.bilhetes = bilhetes;
    }


}



