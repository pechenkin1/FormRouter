package local.myworktech.formrouter.visual.forms;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.visual.abs.AbstractPanel;
import local.myworktech.formrouter.visual.abs.Controller;
import local.myworktech.formrouter.visual.abs.Form;

import javax.swing.*;


public class UserInfoPanel extends AbstractPanel {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JLabel label1;

//    public void clearForm() {
//        usernameTextField.setText("");
//        passwordField.setText("");
//        firstnameTextField.setText("");
//        lastnameTextField.setText("");
//        middlenameTextField.setText("");
//        genderComboBox.setSelectedItem(Gender.Мужской);
//        emailTextField.setText("");
//        phoneTextField.setText("");
//
//    }

//    public void fillFormWithUserToEdit() {
//        usernameTextField.setText(user.getUsername());
//        passwordField.setText(user.getPassword());
//        firstnameTextField.setText(user.getFirstName());
//        lastnameTextField.setText(user.getLastName());
//        middlenameTextField.setText(user.getMiddleName());
//        genderComboBox.setSelectedIndex(user.getGender().toString().equals("Мужской") ? 0 : 1);
//        emailTextField.setText(user.getEmail());
//        phoneTextField.setText(user.getPhone());
//    }

    //    public User fillUserFromForm() {
//        user.setUsername(usernameTextField.getText());
//        user.setPassword(passwordField.getText());
//        user.setFirstName(firstnameTextField.getText());
//        user.setLastName(lastnameTextField.getText());
//        user.setMiddleName(middlenameTextField.getText());
//        user.setGender(genderComboBox.getSelectedIndex() == 0 ? Gender.Мужской : Gender.Женский);
//        user.setEmail(emailTextField.getText());
//        user.setPhone(phoneTextField.getText());
//        return user;
//    }
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

    public UserInfoPanel(Controller controller) {
        super(controller);
    }

    @Override
    public void addForm(Form form) {

    }

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
        addPropertyChangeListener(e -> {
            if ("border".equals(e.getPropertyName())) throw new RuntimeException();
        });

        setLayout(new TableLayout(new double[][]{
                {TableLayout.PREFERRED, 2, TableLayout.PREFERRED, 2, 158, 2, 150},
                {TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED, 5, TableLayout.PREFERRED}}));

        //---- label1 ----
        label1.setText("\u0418\u043c\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f");
        add(label1, new TableLayoutConstraints(2, 2, 2, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(usernameTextField, new TableLayoutConstraints(4, 2, 4, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label2 ----
        label2.setText("\u041f\u0430\u0440\u043e\u043b\u044c");
        add(label2, new TableLayoutConstraints(2, 4, 2, 4, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(passwordField, new TableLayoutConstraints(4, 4, 4, 4, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label3 ----
        label3.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
        add(label3, new TableLayoutConstraints(2, 6, 2, 6, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(lastnameTextField, new TableLayoutConstraints(4, 6, 4, 6, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label4 ----
        label4.setText("\u0418\u043c\u044f");
        add(label4, new TableLayoutConstraints(2, 8, 2, 8, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(firstnameTextField, new TableLayoutConstraints(4, 8, 4, 8, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label5 ----
        label5.setText("\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e");
        add(label5, new TableLayoutConstraints(2, 10, 2, 10, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(middlenameTextField, new TableLayoutConstraints(4, 10, 4, 10, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label6 ----
        label6.setText("\u041f\u043e\u043b");
        add(label6, new TableLayoutConstraints(2, 12, 2, 12, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- genderComboBox ----
        genderComboBox.setModel(new DefaultComboBoxModel<>(new String[]{
                "\u041c\u0443\u0436\u0441\u043a\u043e\u0439",
                "\u0416\u0435\u043d\u0441\u043a\u0438\u0439"
        }));
        add(genderComboBox, new TableLayoutConstraints(4, 12, 4, 12, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label7 ----
        label7.setText("\u042d\u043b\u0435\u043a\u0442\u0440\u043e\u043d\u043d\u044b\u0439 \u0430\u0434\u0440\u0435\u0441");
        add(label7, new TableLayoutConstraints(2, 14, 2, 14, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(emailTextField, new TableLayoutConstraints(4, 14, 4, 14, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));

        //---- label8 ----
        label8.setText("\u0422\u0435\u043b\u0435\u0444\u043e\u043d");
        add(label8, new TableLayoutConstraints(2, 16, 2, 16, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        add(phoneTextField, new TableLayoutConstraints(4, 16, 4, 16, TableLayoutConstraints.FULL, TableLayoutConstraints.CENTER));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
