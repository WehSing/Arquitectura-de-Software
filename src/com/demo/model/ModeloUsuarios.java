package com.demo.model;
import com.demo.model.entity.Usuario;
import java.sql.*;

public class ModeloUsuarios    extends Conexion {
    Conexion conexion;
    public ModeloUsuarios() {
        conexion= new Conexion();
        
    }
    public Usuario verificaPreState(String email, String clave)   {
        Usuario usuario=null;
        Connection accesoDB=conexion.getConexion();
        try {
            PreparedStatement ps=accesoDB.prepareStatement("select * from usuarios where email=? and contraseña=? ");
            ps.setString(1, email);
            ps.setString(2, clave);
            
            
            ResultSet rs=ps.executeQuery();
            if(rs.next())   {
                usuario= new Usuario();
                usuario.setEmail(rs.getString(1));
                usuario.setClave(rs.getString(2));
                
                return usuario;
            }
        }catch (Exception e)    {
            
        }
        return usuario;
    }
    public boolean logup(String nombres,String apellidos,String email,String clave){
        
        PreparedStatement ps=null;
        
        try {
            String consulta="INSERT INTO usuarios(nombre,apellidos,email,contraseña) VALUES (?,?,?,?)";
            ps=getConexion().prepareStatement(consulta);
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, email);
            ps.setString(4, clave);
            if(ps.executeUpdate()==1)   {
                return true;
            }
            
        }catch(Exception e)     {
            System.out.println(e);
        }
        return false;        
    }
    public static void main(String[] args)  {
        ModeloUsuarios co=new ModeloUsuarios(); 
        System.out.println(co.logup("sebas", "raul", "sebas01@hotmail.com", "sebas"));
    }
}
