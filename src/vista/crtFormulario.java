/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author vicec
 */
public class crtFormulario implements ActionListener {

    /**
     * @param args the command line arguments
     *
     *
     *
     *
     */
    public crtFormulario() {

        frmPrueba f = new frmPrueba();

        f.setTitle("Formulario de prueba");

        f.setVisible(true);
        
        f.cmdPrueba.addActionListener(this);

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        System.out.println("Boton pulsado");
    }

}
