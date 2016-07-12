package local.myworktech.formrouter.visual.abs.controllers;

import local.myworktech.formrouter.service.Context;


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

//    @Override
//    public abstract void createWindow();


//    public void add(String childWindow, String parentWindow) {

//        Controller rootController = router.get(owner);
//        Controller dialogController = router.get(child);
//        dialogController.instantiateMyDialog((java.awt.Frame) rootController.getWindow());
//        dialogController.getMyDialog().view();
//    }
}