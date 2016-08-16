package local.myworktech.formrouter.visual.impl.editUserInfoDialog;

import local.myworktech.formrouter.service.Router;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.iface.forms.AbstractDialog;
import local.myworktech.formrouter.visual.iface.forms.Window;
import local.myworktech.formrouter.visual.impl.userInfoPanel.update.UpdateUserPanelController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UserInfoDialog extends AbstractDialog{


        public UserInfoDialog(Controller controller, Window owner) {
            super(controller, owner);
            setModal(true);
            setName("editUserInfoDialog");
            setTitle("Edit user info");
        }

        private void cancelButtonActionPerformed(ActionEvent e) {
            dispose();
        }

        private void okButtonActionPerformed(ActionEvent e) {
            Router router = Router.getInstance();
            Controller controller = router.get("updateUserPanel");
            ((UpdateUserPanelController) controller).updateUser();
            dispose();
        }

        @Override
        public void add(Window form) {
            contentPanel.add((Component) form, BorderLayout.CENTER);
        }


        @Override
        protected void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
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

            // JFormDesigner - End of component initialization  //GEN-END:initComponents
        }

    @Override
    protected void postConstruct() {
        controller.add("updateUserPanel");
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
        // Generated using JFormDesigner Evaluation license - zxc zxc
        private JPanel dialogPane;
        private JPanel contentPanel;
        private JPanel buttonBar;
        private JButton okButton;
        private JButton cancelButton;

        // JFormDesigner - End of variables declaration  //GEN-END:variables
    }

