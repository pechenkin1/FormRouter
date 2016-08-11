package local.myworktech.formrouter.visual.impl.root;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;
import lombok.Getter;

import java.awt.*;

@Getter
public class ParentController extends AbstractController {
    public ParentController(Context context) {
        super(context);
    }

    @Override
    public void createWindow() {
        window = new ParentPanel(this);
//        myForm.view();
    }

    public void clear() {
        ((ParentPanel) window).clearContentPanel();
    }


}