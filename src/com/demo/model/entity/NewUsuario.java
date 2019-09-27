package com.demo.model.entity;


public class NewUsuario {
    private long id;
    private String email;
    private String claveup;
    private String claveup2;
    private String apellidos;
    private String nombres;
    private int tipo;
    public NewUsuario() {
        
    }
    public NewUsuario(long id, String email, String claveup,String claveup2, String apellidos, String nombres, int tipo) {
        this.id = id;
        this.email = email;
        this.claveup = claveup;
        this.claveup2=claveup2;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipo = tipo;
    }
    public NewUsuario(String claveup, String claveup2) {
        this.claveup = claveup;
        this.claveup2 = claveup2;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClaveup() {
        return claveup;
    }
    
    public void getClaveup(String claveup) {
        this.claveup = claveup;
    }
    public String getClaveup2() {
        return claveup2;
    }
    public void getClaveup2(String claveup2)    {
        this.claveup2=claveup2;
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


