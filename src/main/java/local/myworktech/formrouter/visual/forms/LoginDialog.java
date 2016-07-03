/*
 * Created by JFormDesigner on Mon Jul 04 00:09:54 MSK 2016
 */

package local.myworktech.formrouter.visual.forms;

import local.myworktech.formrouter.visual.abs.AbstractDialog;
import local.myworktech.formrouter.visual.abs.Controller;
import local.myworktech.formrouter.visual.abs.Form;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zxc zxc
 */
public class LoginDialog extends AbstractDialog {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel contentPanel;

    public LoginDialog(Controller controller, Frame owner) {
        super(controller, owner);
        setName("Login dialog");
    }

    @Override
    public void addForm(Form form) {
        contentPanel.add((Component) form, BorderLayout.CENTER);
//        contentPanel.repaint();
//        contentPanel.revalidate();
//        contentPanel.setPreferredSize(((Component) form).getPreferredSize());
//        setMinimumSize(((Component) form).getPreferredSize());
//        revalidate();
//        contentPanel.repaint();
//        repaint();
//        pack();
        repaint();
    }

    private void thisWindowOpened(WindowEvent e) {
        try {
            controller.showChildFormOnMe("userInfoPanel");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zxc zxc
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        contentPanel = new JPanel();

        //======== this ========
        setMinimumSize(new Dimension(200, 200));
        setModal(true);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                thisWindowOpened(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== buttonBar ========
        {
            buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));

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

            buttonBar.setLayout(new GridBagLayout());
            ((GridBagLayout) buttonBar.getLayout()).columnWidths = new int[]{0, 85, 80};
            ((GridBagLayout) buttonBar.getLayout()).columnWeights = new double[]{1.0, 0.0, 0.0};

            //---- okButton ----
            okButton.setText("OK");
            buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

            //---- cancelButton ----
            cancelButton.setText("Cancel");
            cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
            buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(buttonBar, BorderLayout.PAGE_END);

        //======== contentPanel ========
        {
            contentPanel.setLayout(new BorderLayout());
        }
        contentPane.add(contentPanel, BorderLayout.CENTER);
        setSize(400, 300);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
