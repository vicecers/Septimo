/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vicec
 */
public class ConsultasUsuarios extends Conexion {

    public void Registrar(Usuarios user) {
        Connection cn = getConexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO `user` VALUES(?,?, ?, ?)";
        
        try {
            ps = cn.prepareStatement(sql);
            
            ps.setInt(1, user.getUser_id());
            ps.setString(2, user.getUser_account());
            ps.setString(3, user.getUser_pass());
            ps.setInt(4, user.getUser_type());
            
            ps.execute();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al registrar usuario " + ex.toString());
        }
        

    }

}
