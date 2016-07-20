package local.myworktech.formrouter.visual.impl.signup;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractDialogController;

public class SignupController extends AbstractDialogController {
    public SignupController(Context context) {
        super(context);
    }

    @Override
    public void createWindow(String owner) {
        window = new SignupDialog(this, router.get(owner).getWindow());
    }
}
