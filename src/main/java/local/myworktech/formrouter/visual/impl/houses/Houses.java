/*
 * Created by JFormDesigner on Thu Jul 14 23:05:42 MSK 2016
 */

package local.myworktech.formrouter.visual.impl.houses;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.iface.forms.AbstractPanel;
import local.myworktech.formrouter.visual.iface.forms.Window;

import javax.swing.*;
import java.awt.*;

/**
 * @author 1 1
 */
public class Houses extends AbstractPanel {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 1 1
    private JPanel panel2;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;

    public Houses(Controller controller) {
        super(controller);

    }

    @Override
    public void add(Window window) {
        System.out.printf("Not supported");
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 1 1
        panel2 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder()));

//        addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setLayout(new TableLayout(new double[][]{
                    {TableLayout.PREFERRED, 2, 77, 2, TableLayout.PREFERRED, 2, 77, 2, TableLayout.PREFERRED, 2, 77, 2, TableLayout.PREFERRED},
                    {TableLayout.PREFERRED}}));

            //---- label1 ----
            label1.setText("\u041f\u043e\u0438\u0441\u043a \u043f\u043e \u0433\u043e\u0440\u043e\u0434\u0443:");
            panel2.add(label1, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            panel2.add(textField1, new TableLayoutConstraints(2, 0, 2, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- label2 ----
            label2.setText("\u041f\u043e\u0438\u0441\u043a \u043f\u043e \u0443\u043b\u0438\u0446\u0435:");
            panel2.add(label2, new TableLayoutConstraints(4, 0, 4, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            panel2.add(textField2, new TableLayoutConstraints(6, 0, 6, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- label3 ----
            label3.setText("\u041f\u043e\u0438\u0441\u043a \u043f\u043e \u0434\u043e\u043c\u0443:");
            panel2.add(label3, new TableLayoutConstraints(8, 0, 8, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            panel2.add(textField3, new TableLayoutConstraints(10, 0, 10, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- button1 ----
            button1.setText("\u041f\u043e\u0438\u0441\u043a");
            panel2.add(button1, new TableLayoutConstraints(12, 0, 12, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        }
        add(panel2, BorderLayout.NORTH);

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1, BorderLayout.CENTER);
        }
        add(panel1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
