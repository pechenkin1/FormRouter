package local.myworktech.formrouter.visual.iface.controllers;

import local.myworktech.formrouter.service.Context;
import org.apache.log4j.Logger;

import java.awt.*;
import java.text.MessageFormat;



public abstract class AbstractDialogController extends AbstractController {

    protected Logger logger = Logger.getLogger(getClass());

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
    public void addDialog(String ownerWindow) {
        createWindow(ownerWindow);
        logger.info(MessageFormat.format("Creating dialog {0} on the {1}", ((Component) this.getWindow()).getName(), ownerWindow));
        getWindow().view();
    }

}