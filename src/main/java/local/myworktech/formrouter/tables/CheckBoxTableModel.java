package local.myworktech.formrouter.tables;

import javax.swing.table.DefaultTableModel;

/**
 * Created by pechenkin on 08.03.2015.
 */
public class CheckBoxTableModel extends DefaultTableModel {

    public CheckBoxTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 1) {
            return false;
        } else {
            return true;
        }
    }

}
//    public DefaultTableModel(Object[] columnNames, int rowCount) {
//        this(convertToVector(columnNames), rowCount);
//    }