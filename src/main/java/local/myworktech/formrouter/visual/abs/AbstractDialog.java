package local.myworktech.formrouter.visual.abs;

import lombok.AllArgsConstructor;

import javax.swing.*;
import java.awt.*;

@AllArgsConstructor
public abstract class AbstractDialog extends JDialog implements Form {
    protected Controller controller;
    protected Frame owner;

    public void view() {
        initComponents();
    }

    public abstract void addForm(Form form);


    protected abstract void initComponents();
}
