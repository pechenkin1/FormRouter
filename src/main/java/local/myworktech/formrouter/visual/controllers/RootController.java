package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.controllers.AbstractController;
import local.myworktech.formrouter.visual.forms.RootFrame;

public class RootController extends AbstractController {
    public RootController(Context context) {
        super(context);
    }

    public void createWindow() {
        window = new RootFrame(this);
        window.view();
    }

}