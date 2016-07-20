package local.myworktech.formrouter.visual.impl.root;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;

public class RootController extends AbstractController {
    public RootController(Context context) {
        super(context);
    }

    public void createWindow() {
        window = new RootFrame(this);
        window.view();
    }

}