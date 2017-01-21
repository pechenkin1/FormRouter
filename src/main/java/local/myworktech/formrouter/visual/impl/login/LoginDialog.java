/*
 * Created by JFormDesigner on Mon Jul 04 00:09:54 MSK 2016
 */

package local.myworktech.formrouter.visual.impl.login;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.entity.Credentials;
import local.myworktech.formrouter.service.Router;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.iface.forms.AbstractDialog;
import local.myworktech.formrouter.visual.iface.forms.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginDialog extends AbstractDialog {

    public LoginDialog(Controller controller, Window owner) {
        super(controller, owner);
        setName("loginDialog");
        setTitle("Login dialog");
    }

    @Override
    public void add(Window window) {
        loginPanel.add((Component) window, BorderLayout.CENTER);
    }

    private void signupButtonActionPerformed(ActionEvent e) {
        dispose();
        Router router = Router.getInstance();
        Controller signupDialog = router.get("signupDialog");
        signupDialog.addDialog("rootFrame");
    }

    private void quitButtonActionPerformed(ActionEvent e) {
        ((LoginController) controller).quitProgram();
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        Credentials credentials = new Credentials(loginField.getText(), passwordField.getText());
        ((LoginController) controller).login(credentials);
    }

    private void passwordFieldKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10)
            loginButton.doClick();
    }

    private void loginFieldKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10)
            passwordField.requestFocus();
    }

    private void thisWindowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 123 123
        buttonBar = new JPanel();
        loginButton = new JButton();
        signupButton = new JButton();
        quitButton = new JButton();
        loginPanel = new JPanel();
        label1 = new JLabel();
        loginField = new JTextField();
        label2 = new JLabel();
        passwordField = new JPasswordField();

        //======== this ========
        setMinimumSize(new Dimension(200, 50));
        setModal(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== buttonBar ========
        {
            buttonBar.setBorder(null);
            buttonBar.setOpaque(false);

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
        contentPane.add(buttonBar, BorderLayout.PAGE_END);

        //======== loginPanel ========
        {
            loginPanel.setMinimumSize(new Dimension(311, 55));
            loginPanel.setPreferredSize(new Dimension(311, 55));
            loginPanel.setBorder(null);
            loginPanel.setMaximumSize(new Dimension(311, 55));
            loginPanel.setLayout(new TableLayout(new double[][]{
                    {59, 130, 112},
                    {TableLayout.PREFERRED, 20, 20}}));
            ((TableLayout) loginPanel.getLayout()).setHGap(5);
            ((TableLayout) loginPanel.getLayout()).setVGap(5);

            //---- label1 ----
            label1.setText("Login");
            loginPanel.add(label1, new TableLayoutConstraints(1, 1, 1, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- loginField ----
            loginField.setText("joe");
            loginField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    loginFieldKeyPressed(e);
                }
            });
            loginPanel.add(loginField, new TableLayoutConstraints(2, 1, 2, 1, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- label2 ----
            label2.setText("Password");
            loginPanel.add(label2, new TableLayoutConstraints(1, 2, 1, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

            //---- passwordField ----
            passwordField.setText("god");
            passwordField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    passwordFieldKeyPressed(e);
                }
            });
            loginPanel.add(passwordField, new TableLayoutConstraints(2, 2, 2, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        }
        contentPane.add(loginPanel, BorderLayout.CENTER);
        setSize(375, 95);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    @Override
    protected void postConstruct() {
        setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 123 123
    private JPanel buttonBar;
    private JButton loginButton;
    private JButton signupButton;
    private JButton quitButton;
    private JPanel loginPanel;
    private JLabel label1;
    private JTextField loginField;
    private JLabel label2;
    private JPasswordField passwordField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}