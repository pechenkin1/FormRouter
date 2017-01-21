package local.myworktech.formrouter.visual.impl.userInfoPanel.create;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;

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
