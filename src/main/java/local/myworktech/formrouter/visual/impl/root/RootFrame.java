package local.myworktech.formrouter.visual.impl.root;

import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.iface.forms.AbstractFrame;
import local.myworktech.formrouter.visual.iface.forms.Window;
import local.myworktech.formrouter.visual.impl.root.menu.RootMenu;
import local.myworktech.formrouter.visual.impl.root.menu.RootMenuController;

import javax.swing.*;
import java.awt.*;

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
//        loggedOutMenu();
        setSize(700, 400);
        setPreferredSize(getSize());
        setLocation(getScreenCenter());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
//        addWindowListener(new WindowAdapter() {
//                              @Override
//                              public void windowOpened(WindowEvent e) {
//                                  try {
//
//                                  } catch (Exception e1) {
//                                      e1.printStackTrace();
//                                  }
//                              }
//                          }
//        );
//        JOptionPane.showMessageDialog(this, "Use \"test:test\" for credentials. ", "Demo mode", JOptionPane.INFORMATION_MESSAGE);
//        controller.add("loginDialog", "rootFrame");
        controller.add("parentPanel");


    }

    public void addMenu(RootMenu rootMenu) {
        add(rootMenu.getRootMenuBar(), BorderLayout.NORTH);
        pack();
        repaint();
    }

    @Override
    public void add(Window window) {
        // getContentPane().remove(1);
        add((Component) window, BorderLayout.CENTER);
        repaint();
    }
}
