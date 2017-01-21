package local.myworktech.formrouter.visual.iface.controllers;

import local.myworktech.formrouter.visual.iface.forms.Window;

public interface Controller {

    void add(String childWindow);

    void addDialog(String ownerWindow);

    /**
     * Create window owned by this controller
     */
    void createWindow();

    /**
     * Create window owned by this controller, with owner window
     *
     * @param owner
     */
    void createWindow(String owner);


    Window getWindow();
}
