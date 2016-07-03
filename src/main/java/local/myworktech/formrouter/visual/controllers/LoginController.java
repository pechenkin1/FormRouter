package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.AbstractController;
import local.myworktech.formrouter.visual.forms.LoginDialog;

import java.awt.*;

public class LoginController extends AbstractController {
    public LoginController(Context context) {
        super(context);
    }

    @Override
    public void instantiateMyForm() throws Exception {
        throw new Exception("This controller cannot instantiate form");
    }

    public void instantiateMyDialog(Frame owner) {
        myForm = new LoginDialog(this, owner);
    }


}
