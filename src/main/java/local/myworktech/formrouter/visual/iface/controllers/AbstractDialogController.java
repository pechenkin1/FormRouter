package local.myworktech.formrouter.visual.iface.controllers;

import local.myworktech.formrouter.service.Context;


public abstract class AbstractDialogController extends AbstractController {

    public AbstractDialogController(Context context) {
        super(context);
    }

    /**
     * Create window owned by this controller
     */
    @Override
    public void createWindow() {
        System.out.println("Not supported.");
    }

    /**
     * Create window owned by this controller, with owner window
     * @param owner
     */
    @Override
    public abstract void createWindow(String owner);

}