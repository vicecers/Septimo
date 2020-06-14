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
public class Datos extends Conexion {

    private Connection cn = null; // recibe el objeto Connection del metodo getConexion()
    private Statement st = null; // crea la instruccion sql
    private ResultSet rs = null; // almacen de datos
    private String[] titulos;   //vector o arreglo que almacena los titulos de la tabla
    private Object[][] datos = null; //arreglo 2d para almacenar las filas y las columnas de la tabla

    public Datos() {

        cn = getConexion();
        try {
            st = cn.createStatement();
            rs = st.executeQuery("select * from user");
            System.out.println("Datos OK");

        } catch (SQLException ex) {
            System.out.println("Error " + ex.toString());
        }

    }

    public Object[][] getDatos() {

        try {
            int cantColumnas = rs.getMetaData().getColumnCount(); // cantidad de columnas

            rs.last();  //va al final de la tabla

            int cantFilas = rs.getRow(); //obtengo la cantidad de filas

            rs.beforeFirst(); //va al principio de la tabla

            titulos = new String[cantColumnas];

            //cargar los titulos de la tabla
            for (int i = 0; i < titulos.length; i++) {
                titulos[i] = rs.getMetaData().getColumnLabel(i + 1);

            }

            //carga de filas y columnas en la matriz de objetos
            datos = new Object[cantFilas][cantColumnas];

            for (int filas = 0; filas < cantFilas; filas++) {
                rs.next();
                for (int columnas = 0; columnas < cantColumnas; columnas++) {
                    datos[filas][columnas] = rs.getString(columnas + 1);

                }

                System.out.println("");
            }

        } catch (SQLException ex) {

            System.out.println("Error " + ex.toString());
        }
        return datos;

    }

    public String[] getTitulos() {
        return titulos;
    }
    
    
    

}
