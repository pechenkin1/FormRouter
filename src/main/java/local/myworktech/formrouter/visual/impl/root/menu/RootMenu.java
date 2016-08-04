/*
 * Created by JFormDesigner on Wed Jul 06 20:32:02 MSK 2016
 */

package local.myworktech.formrouter.visual.impl.root.menu;

import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.service.Router;
import local.myworktech.formrouter.visual.iface.controllers.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author zxc zxc
 */

public class RootMenu {

    private RootMenuController rootMenuController;

    public RootMenu(RootMenuController rootMenuController) {
        this();
        this.rootMenuController = rootMenuController;
    }

    public RootMenu() {
        initComponents();
    }

    public JMenuBar getRootMenuBar() {
        return rootMenuBar;
    }

    private void exitMenuItemActionPerformed(ActionEvent e) {
        rootMenuController.quitProgram();
    }

    private void housesMenuItemActionPerformed(ActionEvent e) {
        Router router = Router.getInstance();
        Controller parent = router.get("parentPanel");
        parent.add("housesPanel");
        ((Component) parent.getWindow()).repaint();
    }

    private void loginMenuItemActionPerformed(ActionEvent e) {
        Router router = Router.getInstance();
        ((JFrame) router.get("rootFrame").getWindow()).repaint();
        Controller child = router.get("loginDialog");
        child.add("loginDialog", "rootFrame");
    }

    private void logoutMenuItemActionPerformed(ActionEvent e) {
        rootMenuController.logout();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 123 123
        rootMenuBar = new JMenuBar();
        fileMenu = new JMenu();
        exitMenuItem = new JMenuItem();
        hSpacer1 = new JPanel(null);
        userName = new JMenu();
        loginMenuItem = new JMenuItem();
        logoutMenuItem = new JMenuItem();
        editUserInfoMenuItem = new JMenuItem();
        objectsMenu = new JMenu();
        housesMenuItem = new JMenuItem();
        tenantsMenuItem = new JMenuItem();

        //======== rootMenuBar ========
        {

            //======== fileMenu ========
            {
                fileMenu.setText("File");

                //---- exitMenuItem ----
                exitMenuItem.setText("Exit");
                exitMenuItem.addActionListener(e -> exitMenuItemActionPerformed(e));
                fileMenu.add(exitMenuItem);
            }
            rootMenuBar.add(fileMenu);
            rootMenuBar.add(hSpacer1);

            //======== userName ========
            {
                userName.setText("Please, login...");

                //---- loginMenuItem ----
                loginMenuItem.setText("Login");
                loginMenuItem.addActionListener(e -> loginMenuItemActionPerformed(e));
                userName.add(loginMenuItem);
            }
            rootMenuBar.add(userName);
        }

        //---- logoutMenuItem ----
        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(e -> logoutMenuItemActionPerformed(e));

        //---- editUserInfoMenuItem ----
        editUserInfoMenuItem.setText("Edit user info");

        //======== objectsMenu ========
        {
            objectsMenu.setText("Objects");

            //---- housesMenuItem ----
            housesMenuItem.setText("Houses");
            objectsMenu.add(housesMenuItem);

            //---- tenantsMenuItem ----
            tenantsMenuItem.setText("Tenants");
            objectsMenu.add(tenantsMenuItem);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 123 123
    private JMenuBar rootMenuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JPanel hSpacer1;
    private JMenu userName;
    private JMenuItem loginMenuItem;
    private JMenuItem logoutMenuItem;
    private JMenuItem editUserInfoMenuItem;
    private JMenu objectsMenu;
    private JMenuItem housesMenuItem;
    private JMenuItem tenantsMenuItem;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void updateMenuToLoggedIn(User currentUser) {
        userName.setText(currentUser.getShortUserInfo());
        userName.remove(loginMenuItem);
        userName.add(editUserInfoMenuItem);
        userName.add(logoutMenuItem);
        rootMenuBar.add(objectsMenu, 1);
    }

    public void updateMenuToLoggedOut() {
        userName.setText("Please, login...");
        userName.remove(editUserInfoMenuItem);
        userName.remove(logoutMenuItem);
        userName.add(loginMenuItem);
        rootMenuBar.remove(objectsMenu);
    }
}
