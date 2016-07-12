package local.myworktech.formrouter.visual.forms;

import local.myworktech.formrouter.visual.abs.controllers.Controller;
import local.myworktech.formrouter.visual.abs.forms.AbstractDialog;
import local.myworktech.formrouter.visual.abs.forms.Window;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SignupDialog extends AbstractDialog {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;

    public SignupDialog(Controller controller, local.myworktech.formrouter.visual.abs.forms.Window owner) {
        super(controller, owner);
        setModal(true);
        setName("Signup dialog");
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
    }

    private void okButtonActionPerformed(ActionEvent e) {
    }

    @Override
    public void add(Window form) {
        contentPanel.add((Component) form, BorderLayout.CENTER);
    }


    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zxc zxc
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            dialogPane.addPropertyChangeListener(e -> {
                if ("border".equals(e.getPropertyName())) throw new RuntimeException();
            });

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new BorderLayout());
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout) buttonBar.getLayout()).columnWidths = new int[]{0, 85, 80};
                ((GridBagLayout) buttonBar.getLayout()).columnWeights = new double[]{1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                okButton.addActionListener(this::okButtonActionPerformed);
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                cancelButton.addActionListener(this::cancelButtonActionPerformed);
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        controller.add("userInfoPanel");
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);

        // JFormDesigner - End of component initialization  //GEN-END:initComponents
//        setVisible(true);
    }

    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
