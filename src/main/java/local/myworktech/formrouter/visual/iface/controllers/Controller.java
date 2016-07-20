package local.myworktech.formrouter.visual.iface.controllers;

import local.myworktech.formrouter.visual.iface.forms.Window;

public interface Controller {
    void createWindow();

    void createWindow(String owner);

    void add(String childWindow);

    void add(String childWindow, String ownerWindow);

    Window getWindow();
}
