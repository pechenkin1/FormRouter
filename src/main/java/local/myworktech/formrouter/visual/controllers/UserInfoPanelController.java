package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.AbstractController;
import local.myworktech.formrouter.visual.forms.UserInfoPanel;
import lombok.Getter;

@Getter
public class UserInfoPanelController extends AbstractController {
    public UserInfoPanelController(Context context) {
        super(context);
    }

    @Override
    public void instantiateMyForm() {
        myForm = new UserInfoPanel(this);
//        myForm.view();
    }

}
