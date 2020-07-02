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
import controlador.CrtUsuarios;
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

        frmUser formulario = new frmUser();
        ConsultasUsuarios consulta = new ConsultasUsuarios();
        Usuarios user = new Usuarios();

        CrtUsuarios control = new CrtUsuarios(formulario, consulta, user);
        control.Iniciar();
        
    }
}
