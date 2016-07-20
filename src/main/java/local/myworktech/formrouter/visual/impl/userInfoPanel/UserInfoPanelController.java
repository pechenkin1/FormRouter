package local.myworktech.formrouter.visual.impl.userInfoPanel;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;
import lombok.Getter;

@Getter
public class UserInfoPanelController extends AbstractController {
    public UserInfoPanelController(Context context) {
        super(context);
    }

    @Override
    public void createWindow() {
        window = new EditUserInfoPanel(this);
//        myForm.view();
    }


}