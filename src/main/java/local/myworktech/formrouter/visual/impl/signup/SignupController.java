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
//        ((JFrame) router.get("rootFrame").getWindow()).repaint(); //todo Delete or retain? check all occurences. Collapse repaint() into Router.class
        Controller loginDialog = router.get("loginDialog");
        loginDialog.add("loginDialog", "rootFrame");
    }
}


//todo DOC: All dialogs created on a rootFrame, not on a parentPanel