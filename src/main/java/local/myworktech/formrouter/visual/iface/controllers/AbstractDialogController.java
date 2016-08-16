package local.myworktech.formrouter.visual.iface.controllers;

import local.myworktech.formrouter.service.Context;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class AbstractDialogController extends AbstractController {

    public AbstractDialogController(Context context) {
        super(context);
    }

    @Override
    public void createWindow() {
        System.out.println("Not supported.");
    }

    @Override
    public abstract void createWindow(String owner);

    @Override
    public void add(String childWindow, String ownerWindow) {
        System.out.println(MessageFormat.format("INFO: Creating dialog {0} on the {1}", childWindow, ownerWindow));
        Controller childController = router.get(childWindow);
        childController.createWindow(ownerWindow);
//        window.add(childController.getWindow());
        childController.getWindow().view();
    }

}