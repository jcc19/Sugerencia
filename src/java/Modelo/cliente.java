/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author TuNombre
 */
public class cliente {
    private int idcliente;
    private String ncliente;
    private String acliente;
    private String direccion;
    private int celular;
    private String comentario;

    public cliente(){        
    }
    
    public cliente(int idcliente, String ncliente, String acliente, String direccion, int celular, String comentario) {
        this.idcliente = idcliente;
        this.ncliente = ncliente;
        this.acliente = acliente;
        this.direccion = direccion;
        this.celular = celular;
        this.comentario = comentario;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNcliente() {
        return ncliente;
    }

    public void setNcliente(String ncliente) {
        this.ncliente = ncliente;
    }

    public String getAcliente() {
        return acliente;
    }

    public void setAcliente(String acliente) {
        this.acliente = acliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
    
}
