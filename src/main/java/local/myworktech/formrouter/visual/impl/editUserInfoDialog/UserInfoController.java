package local.myworktech.formrouter.visual.impl.editUserInfoDialog;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractDialogController;

public class UserInfoController extends AbstractDialogController {
    public UserInfoController(Context context) {
        super(context);
    }

    @Override
    public void createWindow(String owner) {
        window = new UserInfoDialog(this, router.get(owner).getWindow());
    }

}
