package local.myworktech.formrouter.visual.impl.tenants;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;

public class TenantsController extends AbstractController {
    public TenantsController(Context context) {
        super(context);
    }

    @Override
    public void createWindow() {
        window = new TenantsPanel(this);
//        myForm.view();
    }

}
