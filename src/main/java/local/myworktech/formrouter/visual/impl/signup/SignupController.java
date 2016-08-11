package local.myworktech.formrouter.visual.impl.signup;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.service.Router;
import local.myworktech.formrouter.visual.iface.controllers.AbstractDialogController;
import local.myworktech.formrouter.visual.iface.controllers.Controller;

import javax.swing.*;

public class SignupController extends AbstractDialogController {
    public SignupController(Context context) {
        super(context);
    }

    @Override
    public void createWindow(String owner) {
        window = new SignupDialog(this, router.get(owner).getWindow());
    }

    public void showLoginDialog() {
        Router router = Router.getInstance();
        ((JFrame) router.get("rootFrame").getWindow()).repaint();
        Controller child = router.get("loginDialog");
        child.add("loginDialog", "rootFrame");
    }
}
