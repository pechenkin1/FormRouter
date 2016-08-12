package local.myworktech.formrouter.visual.impl.userInfoPanel.create;

import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;
import local.myworktech.formrouter.visual.impl.userInfoPanel.AbstractEditUserInfoPanel;

public class CreateUserPanelController extends AbstractController {
    public CreateUserPanelController(Context context) {
        super(context);
    }

    @Override
    public void createWindow() {
        window = new CreateUserPanel(this);
//        myForm.view();
    }




}
