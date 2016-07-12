/*
 * Created by JFormDesigner on Wed Jul 06 20:32:02 MSK 2016
 */

package local.myworktech.formrouter.visual.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author zxc zxc
 */

public class RootMenu {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JMenuBar rootMenuBar;
    private JMenu fileMenu;
    private JMenuItem loginMenuItem;
    private JMenuItem exitMenuItem;

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
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zxc zxc
        rootMenuBar = new JMenuBar();
        fileMenu = new JMenu();
        loginMenuItem = new JMenuItem();
        exitMenuItem = new JMenuItem();

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
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
