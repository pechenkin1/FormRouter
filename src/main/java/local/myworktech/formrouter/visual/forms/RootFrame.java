package local.myworktech.formrouter.visual.forms;

import local.myworktech.formrouter.visual.abs.controllers.Controller;
import local.myworktech.formrouter.visual.abs.forms.AbstractFrame;
import local.myworktech.formrouter.visual.abs.forms.Window;

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
    protected void initComponents() {
        setTitle("Frame router");
        setLayout(new BorderLayout());
        initMenu();
        setSize(700, 400);
        setPreferredSize(getSize());
        setLocation(getScreenCenter());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
                              @Override
                              public void windowOpened(WindowEvent e) {
                                  try {
                                      controller.add("loginDialog", "rootFrame");
                                  } catch (Exception e1) {
                                      e1.printStackTrace();
                                  }
                              }
                          }
        );

    }

    private void initMenu() {
        RootMenu rootMenu = new RootMenu();
        add(rootMenu.getRootMenuBar(), BorderLayout.NORTH);
        pack();
        repaint();
    }

    @Override
    public void add(Window window) {
        add((Component) window, BorderLayout.CENTER);
//        pack();
        repaint();
    }
}
