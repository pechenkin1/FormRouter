/*
 * Created by JFormDesigner on Thu Aug 11 22:25:44 MSK 2016
 */

package local.myworktech.formrouter.visual.impl.tenants;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.iface.forms.AbstractPanel;
import local.myworktech.formrouter.visual.iface.forms.Window;

import javax.swing.*;
import java.awt.*;

public class TenantsPanel extends AbstractPanel {

    public TenantsPanel(Controller controller) {
        super(controller);
        setName("Tenants Panel");
    }

    @Override
    public void add(Window window) {
        System.out.println("Not supported! please, implement custom exception here!");
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 123 123
        fieldsPanel = new JPanel();
        label1 = new JLabel();
        lastnameTextField = new JTextField();
        label2 = new JLabel();
        firstnameTextField = new JTextField();
        label3 = new JLabel();
        patrnameTextField = new JTextField();
        searchButton = new JButton();
        tablePanel = new JPanel();
        scrollPane1 = new JScrollPane();
        personsTable = new JTable();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder()));


        setLayout(new BorderLayout());

        //======== fieldsPanel ========
        {
            fieldsPanel.setLayout(new TableLayout(new double[][]{
                    {TableLayout.PREFERRED, 7, 87, 7, TableLayout.PREFERRED, 7, 87, 7, TableLayout.PREFERRED, 7, 87, 7, TableLayout.PREFERRED},
                    {TableLayout.PREFERRED}}));

            //---- label1 ----
            label1.setText("\u041f\u043e\u0438\u0441\u043a \u043f\u043e \u0444\u0430\u043c\u0438\u043b\u0438\u0438:");
            fieldsPanel.add(label1, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            fieldsPanel.add(lastnameTextField, new TableLayoutConstraints(2, 0, 2, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- label2 ----
            label2.setText("\u041f\u043e\u0438\u0441\u043a \u043f\u043e \u0438\u043c\u0435\u043d\u0438:");
            fieldsPanel.add(label2, new TableLayoutConstraints(4, 0, 4, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            fieldsPanel.add(firstnameTextField, new TableLayoutConstraints(6, 0, 6, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- label3 ----
            label3.setText("\u041f\u043e\u0438\u0441\u043a \u043f\u043e \u043e\u0442\u0447\u0435\u0441\u0442\u0432\u0443:");
            fieldsPanel.add(label3, new TableLayoutConstraints(8, 0, 8, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            fieldsPanel.add(patrnameTextField, new TableLayoutConstraints(10, 0, 10, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- searchButton ----
            searchButton.setText("\u041f\u043e\u0438\u0441\u043a");
            fieldsPanel.add(searchButton, new TableLayoutConstraints(12, 0, 12, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        }
        add(fieldsPanel, BorderLayout.NORTH);

        //======== tablePanel ========
        {
            tablePanel.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(personsTable);
            }
            tablePanel.add(scrollPane1, BorderLayout.CENTER);
        }
        add(tablePanel, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    @Override
    protected void postConstruct() {
        // do nothing;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 123 123
    private JPanel fieldsPanel;
    private JLabel label1;
    private JTextField lastnameTextField;
    private JLabel label2;
    private JTextField firstnameTextField;
    private JLabel label3;
    private JTextField patrnameTextField;
    private JButton searchButton;
    private JPanel tablePanel;
    private JScrollPane scrollPane1;
    private JTable personsTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
