package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.AbstractController;
import local.myworktech.formrouter.visual.forms.EditUserInfoPanel;
import lombok.Getter;

import java.awt.*;

@Getter
public class UserInfoPanelController extends AbstractController {
    public UserInfoPanelController(Context context) {
        super(context);
    }

    @Override
    public void instantiateMyForm() {
        myForm = new EditUserInfoPanel(this);
//        myForm.view();
    }

    @Override
    public void instantiateMyDialog(Frame owner) {
        try {
            throw new Exception("Not supported");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
