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
        
        frmTabla tabla = new frmTabla();  //prueba carga de la tabla
        tabla.setVisible(true);

    }
}
