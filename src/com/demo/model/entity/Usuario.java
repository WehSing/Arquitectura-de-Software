package com.demo.model.entity;


public class Usuario {
    
    private long id;
    private String email;
    private String clave;
    private String apellidos;
    private String nombres;
    private int tipo;
    private String[] usuarios=null;
    public Usuario() {
    }
    
    public Usuario(long id, String email, String clave, String apellidos, String nombres, int tipo,String usuarios[]) {
        this.id = id;
        this.email = email;
        this.clave = clave;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipo = tipo;
        this.usuarios=usuarios;
        
    }

    public Usuario(String usuarios[],String email, String clave) {
        this.usuarios=usuarios;
        this.email = email;
        this.clave = clave;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String[] getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(String[] usuarios)    {
        this.usuarios=usuarios;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
   

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
