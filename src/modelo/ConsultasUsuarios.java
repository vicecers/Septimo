/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

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

    public void Actualizar(Usuarios user) {
        Connection cn = getConexion();
        PreparedStatement ps = null;
        String sql = "UPDATE `user` SET user_account=?, user_pass=?, user_type=? WHERE user_id=?;";

        try {
            ps = cn.prepareStatement(sql);

            ps.setString(1, user.getUser_account());
            ps.setString(2, user.getUser_pass());
            ps.setInt(3, user.getUser_type());
            ps.setInt(4, user.getUser_id());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar usuario " + ex.toString());
        }
    }

    public void Eliminar(Usuarios user) {
        Connection cn = getConexion();
        PreparedStatement ps = null;
        String sql = "DELETE FROM `user` WHERE user_id = ?;";

        try {
            ps = cn.prepareStatement(sql);

            ps.setInt(1, user.getUser_id());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println("Error al eliminar usuario " + ex.toString());
        }
    }

    public void Buscar(Usuarios user) {
        Connection cn = getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM `user` where user_id = ?;";

        try {
            ps = cn.prepareStatement(sql);

            ps.setInt(1, user.getUser_id());

            rs = ps.executeQuery();
            
            if (rs.next()){
                
                user.setUser_id(rs.getInt(1));
                user.setUser_account(rs.getString(2));
                user.setUser_pass(rs.getString(3));
                user.setUser_type(rs.getInt(4));
                
            }
            
            

        } catch (SQLException ex) {
            System.out.println("usuario no encontrado" + ex.toString());
        }
    }

}
