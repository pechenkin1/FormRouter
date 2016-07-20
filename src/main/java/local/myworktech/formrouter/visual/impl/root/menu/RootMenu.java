/*
 * Created by JFormDesigner on Wed Jul 06 20:32:02 MSK 2016
 */

package local.myworktech.formrouter.visual.impl.root.menu;

import local.myworktech.formrouter.service.Router;
import local.myworktech.formrouter.visual.iface.controllers.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author zxc zxc
 */

public class RootMenu {


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 1 1
    private JMenuBar rootMenuBar;
    private JMenu fileMenu;
    private JMenuItem loginMenuItem;
    private JMenuItem exitMenuItem;
    private JMenu objectsMenu;
    private JMenuItem housesMenuItem;
    private JMenuItem tenantsMenuItem;
    private JPanel hSpacer1;
    private JMenu userName;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;

    public RootMenu() {
        initComponents();
    }

    public JMenuBar getRootMenuBar() {

        return rootMenuBar;
    }

    private void exitMenuItemActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void loginMenuItemActionPerformed(ActionEvent e) {
        // TODO add your code here
        Router router = Router.getInstance();
        ((JFrame) router.get("rootFrame").getWindow()).getContentPane().remove(1);
        ((JFrame) router.get("rootFrame").getWindow()).repaint();
        Controller child = router.get("loginDialog");
        child.add("loginDialog", "rootFrame");
        child.getWindow().view();

    }

    private void housesMenuItemActionPerformed(ActionEvent e) {
        // TODO add your code here
        Router router = Router.getInstance();
        Controller parent = router.get("parentPanel");


        parent.add("housesPanel");
        ((Component) parent.getWindow()).repaint();


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 1 1
        rootMenuBar = new JMenuBar();
        fileMenu = new JMenu();
        loginMenuItem = new JMenuItem();
        exitMenuItem = new JMenuItem();
        objectsMenu = new JMenu();
        housesMenuItem = new JMenuItem();
        tenantsMenuItem = new JMenuItem();
        hSpacer1 = new JPanel(null);
        userName = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();

        //======== rootMenuBar ========
        {

            //======== fileMenu ========
            {
                fileMenu.setText("File");

                //---- loginMenuItem ----
                loginMenuItem.setText("Login");
                loginMenuItem.addActionListener(e -> loginMenuItemActionPerformed(e));
                fileMenu.add(loginMenuItem);

                //---- exitMenuItem ----
                exitMenuItem.setText("Exit");
                exitMenuItem.addActionListener(e -> exitMenuItemActionPerformed(e));
                fileMenu.add(exitMenuItem);
            }
            rootMenuBar.add(fileMenu);

            //======== objectsMenu ========
            {
                objectsMenu.setText("Objects");

                //---- housesMenuItem ----
                housesMenuItem.setText("Houses");
                housesMenuItem.addActionListener(e -> housesMenuItemActionPerformed(e));
                objectsMenu.add(housesMenuItem);

                //---- tenantsMenuItem ----
                tenantsMenuItem.setText("Tenants");
                objectsMenu.add(tenantsMenuItem);
            }
            rootMenuBar.add(objectsMenu);
            rootMenuBar.add(hSpacer1);

            //======== userName ========
            {
                userName.setText("_current_user_name");

                //---- menuItem1 ----
                menuItem1.setText("Edit info");
                userName.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("Change");
                userName.add(menuItem2);
            }
            rootMenuBar.add(userName);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
