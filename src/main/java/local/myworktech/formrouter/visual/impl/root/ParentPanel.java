package local.myworktech.formrouter.visual.impl.root;

import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.iface.forms.AbstractPanel;
import local.myworktech.formrouter.visual.iface.forms.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ParentPanel extends AbstractPanel {




    public ParentPanel(Controller controller) {
        super(controller);
    }

    @Override
    public void add(Window window) {
        add((Component) window, BorderLayout.CENTER);
//        pack();
        repaint();
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
        // Generated using JFormDesigner Evaluation license - 123 123

        //======== this ========
        setMinimumSize(new Dimension(122, 70));
        setPreferredSize(new Dimension(200, 70));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new BorderLayout());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 123 123
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
