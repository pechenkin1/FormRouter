package local.myworktech.formrouter.visual.abs;

import lombok.AllArgsConstructor;

import javax.swing.*;

@AllArgsConstructor
public abstract class AbstractPanel extends JPanel implements Form {
    protected Controller controller;

    public void view() {
        initComponents();
    }

    public abstract void addForm(Form form) throws Exception;

    protected abstract void initComponents();
}
