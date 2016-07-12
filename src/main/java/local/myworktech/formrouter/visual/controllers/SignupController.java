package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.controllers.AbstractDialogController;
import local.myworktech.formrouter.visual.forms.SignupDialog;

public class SignupController extends AbstractDialogController {
    public SignupController(Context context) {
        super(context);
    }

    @Override
    public void createWindow(String owner) {
        window = new SignupDialog(this, router.get(owner).getWindow());
    }
}
