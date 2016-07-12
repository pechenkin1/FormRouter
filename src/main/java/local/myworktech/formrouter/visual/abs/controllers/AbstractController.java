package local.myworktech.formrouter.visual.abs.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.service.Router;
import local.myworktech.formrouter.visual.abs.forms.Window;

public abstract class AbstractController implements Controller {
    protected Context context;
    protected Router router = Router.getInstance();
    protected Window window;

    public AbstractController(Context context) {
        this.context = context;
    }

    @Override
    public Window getWindow() {
        return window;
    }

    @Override
    public abstract void createWindow();

    @Override
    public void createWindow(String owner) {
        System.out.println("Not supported.");
    }

    @Override
    public void add(String childWindow) {
        Controller childController = router.get(childWindow);
        childController.createWindow();
        window.add(childController.getWindow());
        childController.getWindow().view();
    }

    @Override
    public void add(String childWindow, String ownerWindow) {
        Controller childController = router.get(childWindow);
        childController.createWindow(ownerWindow);
//        window.add(childController.getWindow());
        childController.getWindow().view();
    }
}