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
        this.formulario.btnModificar.addActionListener(this);
        this.formulario.btnBuscar.addActionListener(this);

    }

    public void Iniciar() {

        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setTitle("Crud Java MVC");
        Clear();
    }

    public void Clear() {
        formulario.txt_user_id.setText(null);
        formulario.txt_user_account.setText(null);
        formulario.txt_user_pass.setText(null);
        formulario.txt_user_type.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formulario.btnRegistrar) {
            user.setUser_id(Integer.parseInt(formulario.txt_user_id.getText()));
            user.setUser_account(formulario.txt_user_account.getText());
            user.setUser_pass(formulario.txt_user_pass.getText());
            user.setUser_type(Integer.parseInt(formulario.txt_user_type.getText()));
            consulta.Registrar(user);
        }
        if (e.getSource() == formulario.btnBuscar) {
            user.setUser_id(Integer.parseInt(formulario.txtBuscar.getText()));
            consulta.Buscar(user);
            formulario.txt_user_id.setText(String.valueOf(user.getUser_id()));
            formulario.txt_user_account.setText(user.getUser_account());
            formulario.txt_user_pass.setText(user.getUser_pass());
            formulario.txt_user_type.setText(String.valueOf(user.getUser_type()));

        }
        if (e.getSource() == formulario.btnModificar) {
            user.setUser_id(Integer.parseInt(formulario.txt_user_id.getText()));
            user.setUser_account(formulario.txt_user_account.getText());
            user.setUser_pass(formulario.txt_user_pass.getText());
            user.setUser_type(Integer.parseInt(formulario.txt_user_type.getText()));
        }
        consulta.Actualizar(user);
    }

}
