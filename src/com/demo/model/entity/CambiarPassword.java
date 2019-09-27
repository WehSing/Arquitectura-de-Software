package com.demo.model.entity;

/**
 *
 * @author sergio
 */
public class CambiarPassword {
    private long id;
    private String email;
    private String password;
    private String password2;
    private String apellidos;
    private String nombres;
    private int tipo;
    public CambiarPassword() {
        
    }
    public CambiarPassword(long id, String email, String password,String password2, String apellidos, String nombres, int tipo) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.password2=password2;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipo = tipo;
    }
    public CambiarPassword(String password, String password2) {
        this.password = password;
        this.password2 = password2;
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

    public String getPassword() {
        return password;
    }
    
    public void getPassword(String password) {
        this.password = password;
    }
    public String getPassword2() {
        return password2;
    }
    public void getPassword2(String password2)    {
        this.password2=password2;
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
