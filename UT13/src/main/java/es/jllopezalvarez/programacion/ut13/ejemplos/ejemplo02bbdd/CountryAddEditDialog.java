package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd;

import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.dataaccess.CountryDataAccess;

import javax.swing.*;
import java.awt.event.*;

public class CountryAddEditDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField tfNuevoPais;

    public CountryAddEditDialog() {
        setContentPane(contentPane);
        setSize(400, 200);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        String nombrePais = this.tfNuevoPais.getText();
        if (nombrePais.isBlank()){
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Crear nuevo país", JOptionPane.WARNING_MESSAGE);
            return;
        }


        CountryDataAccess.save(nombrePais);

        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

}
