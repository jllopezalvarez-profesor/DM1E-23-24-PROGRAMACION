package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd;

import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.dataaccess.CountryDataAccess;
import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.models.Country;
import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.tablemodels.CountryTableModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class CountryListForm extends JFrame {

    private List<Country> countries;
    private CountryTableModel countryTableModel;
    private JTable countryTable;
    private JPanel contentPanel;
    private JButton deleteButton;
    private JButton addNewButton;

    public CountryListForm() {
        this.setTitle("Países");
        this.setSize(900, 600);
//        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(contentPanel);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                countryTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                cargarDatosPaises();
            }

        });

        this.countryTable.getSelectionModel().addListSelectionListener(this::onTableSelected);


        deleteButton.addActionListener(this::onDeleteButtonClic);
        addNewButton.addActionListener(this::onAddNewClic);
    }

    private  void onAddNewClic(ActionEvent e) {
        CountryAddEditDialog dialog = new CountryAddEditDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.out.println("Tras llamar al diálogo");
        cargarDatosPaises();
    }

    private void cargarDatosPaises() {
        countries = CountryDataAccess.findAll();
        countryTableModel = new CountryTableModel(countries);
        countryTable.setModel(countryTableModel);
    }

    private void onDeleteButtonClic(ActionEvent e) {
        System.out.println("En clic de botón");
        // Obtener el ID del elemento seleccionado en la tabla
        int filaSeleccionada = countryTable.getSelectionModel().getSelectedIndices()[0];
        int idSeleccionado = (int) countryTableModel.getValueAt(filaSeleccionada, 0);

        try{
            // Borrar el país del id seleccionado
            CountryDataAccess.deleteById(idSeleccionado);

            // Mensaje de éxito
            JOptionPane.showMessageDialog(this, "País eliminado con éxito", "Eliminar país", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex){
            // Mensaje de error
            String errorMessage = String.format("Error al eliminar el país: %s", ex.getMessage());
            JOptionPane.showMessageDialog(this, errorMessage, "Eliminar país",JOptionPane.ERROR_MESSAGE);
        }

        // Recargar la tabla
        cargarDatosPaises();


    }

    private void onTableSelected(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            System.out.println(e);
            this.deleteButton.setEnabled(true);
        }
    }
}
