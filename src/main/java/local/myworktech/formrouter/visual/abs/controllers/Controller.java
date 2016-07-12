package local.myworktech.formrouter.visual.abs.controllers;

import local.myworktech.formrouter.visual.abs.forms.Window;

public interface Controller {
    void createWindow();

    void createWindow(String owner);

    void add(String childWindow);

    void add(String childWindow, String ownerWindow);

    Window getWindow();
}
