package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.AbstractController;
import local.myworktech.formrouter.visual.forms.ParentPanel;
import lombok.Getter;

@Getter
public class ParentController extends AbstractController {
    public ParentController(Context context) {
        super(context);
    }

    @Override
    public void instantiateMyForm() {
        myForm = new ParentPanel(this);
//        myForm.view();
    }
}