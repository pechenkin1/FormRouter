/*
 * Created by JFormDesigner on Mon Jul 04 00:09:54 MSK 2016
 */

package local.myworktech.formrouter.visual.forms;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.visual.abs.controllers.Controller;
import local.myworktech.formrouter.visual.abs.forms.AbstractDialog;
import local.myworktech.formrouter.visual.abs.forms.Window;
import local.myworktech.formrouter.visual.controllers.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author zxc zxc
 */
public class LoginDialog extends AbstractDialog {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JPanel buttonBar;
    private JButton loginButton;
    private JButton signupButton;
    private JButton quitButton;
    private JPanel contentPanel;
    private JPanel loginPanel;
    private JLabel label1;
    private JTextField loginField;
    private JLabel label2;
    private JTextField passwordField;

    public LoginDialog(Controller controller, Window owner) {
        super(controller, owner);
        setName("Login dialog");
    }

    @Override
    public void add(Window window) {
        contentPanel.add((Component) window, BorderLayout.CENTER);
    }

    private void signupButtonActionPerformed(ActionEvent e) {
        dispose();
        controller.add("signupDialog", "rootFrame");
//        System.out.println(1);
//        System.out.println(this.toString());
    }

    private void quitButtonActionPerformed(ActionEvent e) {
        ((LoginController) controller).quitProgram();
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        ((LoginController) controller).login(loginField.getText(), passwordField.getText());
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zxc zxc
        buttonBar = new JPanel();
        loginButton = new JButton();
        signupButton = new JButton();
        quitButton = new JButton();
        contentPanel = new JPanel();
        loginPanel = new JPanel();
        label1 = new JLabel();
        loginField = new JTextField();
        label2 = new JLabel();
        passwordField = new JTextField();

        //======== this ========
        setMinimumSize(new Dimension(200, 140));
        setModal(true);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== buttonBar ========
        {
            buttonBar.setBorder(null);
            buttonBar.setOpaque(false);

            // JFormDesigner evaluation mark
            buttonBar.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), buttonBar.getBorder()));
            buttonBar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });

            buttonBar.setLayout(new FlowLayout());

            //---- loginButton ----
            loginButton.setText("Login");
            loginButton.addActionListener(e -> loginButtonActionPerformed(e));
            buttonBar.add(loginButton);

            //---- signupButton ----
            signupButton.setText("Signup");
            signupButton.addActionListener(e -> signupButtonActionPerformed(e));
            buttonBar.add(signupButton);

            //---- quitButton ----
            quitButton.setText("Quit program");
            quitButton.addActionListener(e -> quitButtonActionPerformed(e));
            buttonBar.add(quitButton);
        }
        contentPane.add(buttonBar, BorderLayout.SOUTH);

        //======== contentPanel ========
        {
            contentPanel.setLayout(new BorderLayout());

            //======== loginPanel ========
            {
                loginPanel.setMinimumSize(new Dimension(311, 50));
                loginPanel.setPreferredSize(new Dimension(311, 50));
                loginPanel.setLayout(new TableLayout(new double[][]{
                        {59, 130, 112},
                        {20, 20, 20}}));
                ((TableLayout) loginPanel.getLayout()).setHGap(5);
                ((TableLayout) loginPanel.getLayout()).setVGap(5);

                //---- label1 ----
                label1.setText("Login");
                loginPanel.add(label1, new TableLayoutConstraints(1, 1, 1, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
                loginPanel.add(loginField, new TableLayoutConstraints(2, 1, 2, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

                //---- label2 ----
                label2.setText("Password");
                loginPanel.add(label2, new TableLayoutConstraints(1, 2, 1, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
                loginPanel.add(passwordField, new TableLayoutConstraints(2, 2, 2, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
            }
            contentPanel.add(loginPanel, BorderLayout.CENTER);
        }
        contentPane.add(contentPanel, BorderLayout.CENTER);
        setSize(375, 165);
        setLocationRelativeTo(null);
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
