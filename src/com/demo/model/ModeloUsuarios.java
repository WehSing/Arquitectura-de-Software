package com.demo.model;
import com.demo.model.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ModeloUsuarios extends conexion{
    public boolean registrar(Usuario user)  {
        PreparedStatement ps=null;
        Connection con=getConexion();
        String sql="INSERT INTO usuarios(id,nombre, apellidos,email,contraseña) VALUES(?,?,?,?)"; 
        try {
            ps=con.prepareStatement(sql);
            ps.setLong(1, user.getId());
            ps.setString(2,user.getNombres());
            ps.setString(3,user.getApellidos());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getClave());
            ps.execute();
            return true;
        }catch(SQLException e)  {
            System.err.println(e);
            return false;
        }finally    {
            try {
                con.close();
            }catch(SQLException e)  {
                System.err.println(e);
                
            }
        }
    }
    public boolean modificar(Usuario user)  {
        PreparedStatement ps=null;
        Connection con=getConexion();
        String sql="UPDATE usuarios SET id=? nombre=?, apellidos=?, email=?,contraseña=? WHERE cod=?"; 
        try {
            ps=con.prepareStatement(sql);
            ps.setLong(1, user.getId());
            ps.setString(2,user.getNombres());
            ps.setString(3,user.getApellidos());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getClave());
            ps.setString(6, user.getCod());
            ps.execute();
            return true;
        }catch(SQLException e)  {
            System.err.println(e);
            return false;
        }finally    {
            try {
                con.close();
            }catch(SQLException e)  {
                System.err.println(e);
                
            }
        }
    }
    public boolean login(Usuario user)  {
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=getConexion();
        String sql="SELECT * FROM usuarios WHERE email=? contraseña=?"; 
        try {
            ps=con.prepareStatement(sql);
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getClave());
            ps.executeQuery();
            
            if(rs.next())   {
                user.setEmail(rs.getString("email"));
                user.setClave(rs.getString("contraseña"));
                return true;
            }
            return false;
        }catch(SQLException e)  {
            System.err.println(e);
            return false;
        }finally    {
            try {
                con.close();
            }catch(SQLException e)  {
                System.err.println(e);
                
            }
        }
    }
}
