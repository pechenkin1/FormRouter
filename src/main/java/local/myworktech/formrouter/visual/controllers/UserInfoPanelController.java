package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.controllers.AbstractController;
import local.myworktech.formrouter.visual.forms.EditUserInfoPanel;
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
