package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.AbstractController;
import local.myworktech.formrouter.visual.forms.RootFrame;

import java.awt.*;

public class RootController extends AbstractController {
    public RootController(Context context) {
        super(context);
    }

    public void instantiateMyForm() {
        myForm = new RootFrame(this);
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