package local.myworktech.formrouter.visual.iface.forms;

import local.myworktech.formrouter.visual.iface.controllers.Controller;
import lombok.AllArgsConstructor;

import javax.swing.*;

@AllArgsConstructor
public abstract class AbstractFrame extends JFrame implements Frame {
    protected Controller controller;

    @Override
    public void view() {
        initComponents();
    }

    @Override
    public abstract void add(Window window);

    protected abstract void initComponents();
}
