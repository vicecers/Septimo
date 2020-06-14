/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author vicec
 */
import modelo.Conexion;
import modelo.Datos;
import java.sql.*;

import modelo.*;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        // Connection cn;  
        //cn = new Conexion().getConexion(); //prueba de conexion a la base de datos
        // Datos d = new Datos(); //prueba de acceso a datos

        Usuarios user = new Usuarios();
        ConsultasUsuarios cu = new ConsultasUsuarios();
        /*
        user.setUser_id(1000);
        user.setUser_account("Usuario1");
        user.setUser_pass("contraseña1");
        user.setUser_type(100);

        cu.Registrar(user);
         */

      /*
        user.setUser_id(3);
        user.setUser_account("Usuario1");
        user.setUser_pass("contraseña1");
        user.setUser_type(100);
        cu.Actualizar(user);
        
        */
      
        /*user.setUser_id(4);
        cu.Eliminar(user);*/
        
        user.setUser_id(3);
        cu.Buscar(user);
        
        System.out.println(user.getUser_id());
        System.out.println(user.getUser_account());
        System.out.println(user.getUser_pass());
        System.out.println(user.getUser_type());
        
        
        frmTabla tabla = new frmTabla();  //prueba carga de la tabla
        tabla.setVisible(true);

    }
}
