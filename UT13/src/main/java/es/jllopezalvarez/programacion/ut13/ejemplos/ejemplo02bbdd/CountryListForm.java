package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd;

import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.dataaccess.CountryDataAccess;
import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.models.Country;
import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.tablemodels.CountryTableModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.*;
import java.util.List;

public class CountryListForm extends JFrame {

    private List<Country> countries;
    private CountryTableModel countryTableModel;
    private JTable countryTable;
    private JPanel contentPanel;

    public CountryListForm(){
        this.setTitle("Países");
        this.setSize(900, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(contentPanel);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                countries = CountryDataAccess.findAll();
                countryTableModel = new CountryTableModel(countries);
                countryTable.setModel(countryTableModel);
//                countryTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        });


    }
}
