package local.myworktech.formrouter.visual.impl.houses;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;
import lombok.Getter;

@Getter
public class HousesController extends AbstractController {
    public HousesController(Context context) {
        super(context);
    }

    @Override
    public void createWindow() {
        window = new Houses(this);
        window.view();

    }


}