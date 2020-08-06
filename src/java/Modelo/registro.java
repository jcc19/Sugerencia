/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author joseph
 */
public class registro {
    private int idregsitro;
    private int nregistro;
    private String descripcion;
    private String sugerencia;
    private String credito;
    private String encargado;
    
    public registro(){    
    }

    public registro(int idregsitro, int nregistro, String descripcion, String sugerencia, String credito, String encargado) {
        this.idregsitro = idregsitro;
        this.nregistro = nregistro;
        this.descripcion = descripcion;
        this.sugerencia = sugerencia;
        this.credito = credito;
        this.encargado = encargado;
    }

    public int getIdregsitro() {
        return idregsitro;
    }

    public void setIdregsitro(int idregsitro) {
        this.idregsitro = idregsitro;
    }

    public int getNregistro() {
        return nregistro;
    }

    public void setNregistro(int nregistro) {
        this.nregistro = nregistro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    
    
}
