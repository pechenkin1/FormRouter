/*
 * Created by JFormDesigner on Sun Jul 03 20:22:50 MSK 2016
 */

package local.myworktech.formrouter.visual.impl.userInfoPanel;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.iface.forms.AbstractPanel;
import local.myworktech.formrouter.visual.iface.forms.Window;

import javax.swing.*;

/**
 * @author zxc zxc
 */
public class EditUserInfoPanel extends AbstractPanel {
    // JFormDesigner - Variables declaration - DO NOT MODIFY
    // GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JLabel label1;
    private JTextField usernameTextField;
    private JLabel label2;
    private JPasswordField passwordField;
    private JLabel label3;
    private JTextField lastnameTextField;
    private JLabel label4;
    private JTextField firstnameTextField;
    private JLabel label5;
    private JTextField middlenameTextField;
    private JLabel label6;
    private JComboBox<String> genderComboBox;
    private JLabel label7;
    private JTextField emailTextField;
    private JLabel label8;
    private JTextField phoneTextField;
    public EditUserInfoPanel(Controller controller) {
        super(controller);
    }

    @Override
    public void add(Window window) {
        System.out.printf("Not supported");
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zxc zxc
        label1 = new JLabel();
        usernameTextField = new JTextField();
        label2 = new JLabel();
        passwordField = new JPasswordField();
        label3 = new JLabel();
        lastnameTextField = new JTextField();
        label4 = new JLabel();
        firstnameTextField = new JTextField();
        label5 = new JLabel();
        middlenameTextField = new JTextField();
        label6 = new JLabel();
        genderComboBox = new JComboBox<>();
        label7 = new JLabel();
        emailTextField = new JTextField();
        label8 = new JLabel();
        phoneTextField = new JTextField();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder()));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if ("border".equals(e.getPropertyName())) throw new RuntimeException();
            }
        });

        setLayout(new TableLayout(new double[][]{
                {10, 200, 5, 158, 2},
                {10, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED}}));

        //---- label1 ----
        label1.setText("\u0418\u043c\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f");
        add(label1, new TableLayoutConstraints(1, 2, 1, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(usernameTextField, new TableLayoutConstraints(3, 2, 3, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label2 ----
        label2.setText("\u041f\u0430\u0440\u043e\u043b\u044c");
        add(label2, new TableLayoutConstraints(1, 4, 1, 4, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(passwordField, new TableLayoutConstraints(3, 4, 3, 4, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label3 ----
        label3.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
        add(label3, new TableLayoutConstraints(1, 6, 1, 6, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(lastnameTextField, new TableLayoutConstraints(3, 6, 3, 6, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label4 ----
        label4.setText("\u0418\u043c\u044f");
        add(label4, new TableLayoutConstraints(1, 8, 1, 8, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(firstnameTextField, new TableLayoutConstraints(3, 8, 3, 8, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label5 ----
        label5.setText("\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e");
        add(label5, new TableLayoutConstraints(1, 10, 1, 10, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(middlenameTextField, new TableLayoutConstraints(3, 10, 3, 10, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label6 ----
        label6.setText("\u041f\u043e\u043b");
        add(label6, new TableLayoutConstraints(1, 12, 1, 12, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- genderComboBox ----
        genderComboBox.setModel(new DefaultComboBoxModel<>(new String[]{
                "\u041c\u0443\u0436\u0441\u043a\u043e\u0439",
                "\u0416\u0435\u043d\u0441\u043a\u0438\u0439"
        }));
        add(genderComboBox, new TableLayoutConstraints(3, 12, 3, 12, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label7 ----
        label7.setText("\u042d\u043b\u0435\u043a\u0442\u0440\u043e\u043d\u043d\u044b\u0439 \u0430\u0434\u0440\u0435\u0441");
        add(label7, new TableLayoutConstraints(1, 14, 1, 14, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(emailTextField, new TableLayoutConstraints(3, 14, 3, 14, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label8 ----
        label8.setText("\u0422\u0435\u043b\u0435\u0444\u043e\u043d");
        add(label8, new TableLayoutConstraints(1, 16, 1, 16, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(phoneTextField, new TableLayoutConstraints(3, 16, 3, 16, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

}
