package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.tablemodels;

import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.models.Country;

import javax.swing.table.AbstractTableModel;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CountryTableModel extends AbstractTableModel {

    private final List<Country> data;
    private final String[] columnNames = {"Id", "Nombre", "Última modificación"};

    public CountryTableModel(List<Country> data) {
        this.data = data;
    }

    public CountryTableModel() {
        this(new ArrayList<>());
    }

    @Override
    public int getRowCount() {
        return this.data.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class;
            case 1 -> String.class;
            case 2 -> LocalDateTime.class;
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Country country = this.data.get(rowIndex);
        return getValueInObject(country, columnIndex);
    }

    private Object getValueInObject(Country country, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> country.getCountryId();
            case 1 -> country.getName();
            case 2 -> country.getLastUpdate();
            default -> null;
        };
    }
}
