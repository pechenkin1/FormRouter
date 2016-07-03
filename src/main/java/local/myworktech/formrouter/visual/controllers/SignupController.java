package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.AbstractController;
import local.myworktech.formrouter.visual.forms.SignupDialog;

import java.awt.*;

public class SignupController extends AbstractController {
    public SignupController(Context context) {
        super(context);
    }

    @Override
    public void instantiateMyForm() throws Exception {
        throw new Exception("This controller cannot instantiate form");
    }

    public void instantiateMyDialog(Frame owner) {
        myForm = new SignupDialog(this, owner);
    }


}
