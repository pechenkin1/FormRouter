package local.myworktech.formrouter.visual.forms;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.visual.abs.controllers.Controller;
import local.myworktech.formrouter.visual.abs.forms.AbstractPanel;
import local.myworktech.formrouter.visual.abs.forms.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ParentPanel extends AbstractPanel {


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JButton signupButton;
    private JLabel label1;
    private JButton loginButton;
    private JTextField textField1;

    public ParentPanel(Controller controller) {
        super(controller);
    }

    @Override
    public void add(Window form) {
        System.out.println("Not supported");
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        controller.add("loginDialog", "rootFrame");
    }

    private void signupButtonActionPerformed(ActionEvent e) {
        controller.add("signupDialog", "rootFrame");
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zxc zxc
        signupButton = new JButton();
        label1 = new JLabel();
        loginButton = new JButton();
        textField1 = new JTextField();

        //======== this ========
        setMinimumSize(new Dimension(122, 70));
        setPreferredSize(new Dimension(200, 70));

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
                {119, 15, TableLayout.FILL},
                {30, 10, 30, 120}}));

        //---- signupButton ----
        signupButton.setText("Sign up");
        signupButton.addActionListener(e -> signupButtonActionPerformed(e));
        add(signupButton, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- label1 ----
        label1.setText("text");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        add(label1, new TableLayoutConstraints(2, 0, 2, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- loginButton ----
        loginButton.setText("Login");
        loginButton.addActionListener(e -> loginButtonActionPerformed(e));
        add(loginButton, new TableLayoutConstraints(0, 2, 0, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        add(textField1, new TableLayoutConstraints(2, 2, 2, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
