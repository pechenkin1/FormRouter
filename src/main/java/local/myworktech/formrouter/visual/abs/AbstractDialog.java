package local.myworktech.formrouter.visual.abs;

import lombok.AllArgsConstructor;

import javax.swing.*;

@AllArgsConstructor
public abstract class AbstractDialog extends JDialog implements Form {
    protected Controller controller;

    public void view() {
        initComponents();
    }

    public abstract void addForm(Form form);

    protected abstract void initComponents();
}
