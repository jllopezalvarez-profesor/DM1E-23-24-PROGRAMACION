package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPrincipal extends JFrame {
    private JPanel panelPpal;
    private JTextField tfNombre;
    private JTextField tfApellidos;
    private JTextField tfNombreApellidos;
    private JButton btnCopiarDatos;
    private JButton btnSalir;


    public FormPrincipal() {
        this.setContentPane(panelPpal);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 400);
        this.setVisible(true);


        btnCopiarDatos.addActionListener(e -> tfNombreApellidos.setText(String.format("%s %s"
                , tfNombre.getText()
                , tfApellidos.getText())));
        btnSalir.addActionListener(e -> FormPrincipal.this.dispose());

    }
}
