package local.myworktech.formrouter.visual.iface.forms;

import local.myworktech.formrouter.visual.iface.controllers.Controller;
import lombok.AllArgsConstructor;

import javax.swing.*;

@AllArgsConstructor
public abstract class AbstractPanel extends JPanel implements Panel {
    protected Controller controller;

    @Override
    public void view() {
        initComponents();
        postConstruct();
    }

    @Override
    public abstract void add(Window window);

    protected abstract void initComponents();

    protected abstract void postConstruct();
}