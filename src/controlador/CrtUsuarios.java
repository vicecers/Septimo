/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.*;
import javax.swing.JOptionPane;
import modelo.*;
import vista.frmUser;

/**
 *
 * @author vicec
 */
public class CrtUsuarios implements ActionListener {

    private frmUser formulario;
    private ConsultasUsuarios consulta;
    private Usuarios user;

    public CrtUsuarios(frmUser formulario, ConsultasUsuarios consulta, Usuarios user) {
        this.formulario = formulario;
        this.consulta = consulta;
        this.user = user;

        formulario = new frmUser();
        consulta = new ConsultasUsuarios();
        user = new Usuarios();

        this.formulario.btnRegistrar.addActionListener(this);
        this.formulario.btnBuscar.addActionListener(this);

    }

    public void Iniciar() {
        formulario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==formulario.btnBuscar){
            System.out.println("Elemento buscado");
        }
        if(e.getSource()==formulario.btnRegistrar){
            user.setUser_id(Integer.parseInt(formulario.txt_user_id.getText()));
            user.setUser_account(formulario.txt_user_account.getText());
            user.setUser_pass(formulario.txt_user_pass.getText());
            user.setUser_type(Integer.parseInt(formulario.txt_user_type.getText()));
            
            
            consulta.Registrar(user);
            
        }

    }

}
