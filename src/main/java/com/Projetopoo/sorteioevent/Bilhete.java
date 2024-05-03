package com.Projetopoo.sorteioevent;

public class Bilhete {
    private Long id;
    private Usuario usuario;
    private NotaFiscal notaFiscal;

    // getters
    public Long getId(){
        return id;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public NotaFiscal getNotaFiscal(){
        return notaFiscal;
    }

    // Setters
    public void setID(Long id){
        this.id = id;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    public void setNotaFiscal(NotaFiscal notaFiscal){
        this.notaFiscal = notaFiscal;
    }


}
