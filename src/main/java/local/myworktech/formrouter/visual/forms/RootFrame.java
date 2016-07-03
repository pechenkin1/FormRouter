package local.myworktech.formrouter.visual.forms;

import local.myworktech.formrouter.visual.abs.AbstractFrame;
import local.myworktech.formrouter.visual.abs.Controller;
import local.myworktech.formrouter.visual.abs.Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RootFrame extends AbstractFrame {

    public RootFrame(Controller controller) {
        super(controller);
    }

    private Point getScreenCenter() {
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
        Integer screenWidth = ((Double) screenDimension.getWidth()).intValue();
        Integer screenHeight = ((Double) screenDimension.getHeight()).intValue();
        return new Point(screenWidth / 2 - getWidth() / 2, screenHeight / 2 - getHeight() / 2);
    }

    @Override
    public void addForm(Form form) {
        getRootPane().getContentPane().removeAll();
        add((Component) form, BorderLayout.CENTER);
//        pack();
        repaint();
    }

    @Override
    protected void initComponents() {
        setTitle("Swingui");
        setLayout(new BorderLayout());
        setSize(700, 400);
        setLocation(getScreenCenter());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
                              @Override
                              public void windowOpened(WindowEvent e) {
                                  try {
                                      controller.showChildFormOnMe("parentPanel");
                                  } catch (Exception e1) {
                                      e1.printStackTrace();
                                  }
                              }
                          }
        );
        setVisible(true);
    }
}
