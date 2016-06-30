package local.myworktech.formrouter.visual.forms;

import info.clearthought.layout.TableLayout;
import info.clearthought.layout.TableLayoutConstraints;
import local.myworktech.formrouter.visual.abs.AbstractPanel;
import local.myworktech.formrouter.visual.abs.Controller;
import local.myworktech.formrouter.visual.abs.Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ParentPanel extends AbstractPanel {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - zxc zxc
    private JButton showDialogButton;
    private JLabel label1;
    private JButton button2;
    private JTextField textField1;

    public ParentPanel(Controller controller) {
        super(controller);
    }

    @Override
    public void addForm(Form form) throws Exception {
        throw new NotSupportedToShowException(form, this);
    }

    private void showDialogButtonActionPerformed(ActionEvent e) {
        controller.showChildFormOnMe("rootFrame");
    }

    @Override
    protected void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - zxc zxc
        showDialogButton = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
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
        addPropertyChangeListener(e -> {
            if ("border".equals(e.getPropertyName())) throw new RuntimeException();
        });

        setLayout(new TableLayout(new double[][]{
                {119, 15, TableLayout.FILL},
                {30, 10, 30, 120}}));

        //---- showDialogButton ----
        showDialogButton.setText("show dialog");
        showDialogButton.addActionListener(this::showDialogButtonActionPerformed);
        add(showDialogButton, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- label1 ----
        label1.setText("text");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        add(label1, new TableLayoutConstraints(2, 0, 2, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- button2 ----
        button2.setText("text");
        add(button2, new TableLayoutConstraints(0, 2, 0, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        add(textField1, new TableLayoutConstraints(2, 2, 2, 2, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
