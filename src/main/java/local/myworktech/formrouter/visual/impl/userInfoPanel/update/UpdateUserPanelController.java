package local.myworktech.formrouter.visual.impl.userInfoPanel.update;

import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractController;

public class UpdateUserPanelController extends AbstractController {
    public UpdateUserPanelController(Context context) {
        super(context);
    }

    @Override
    public void createWindow() {
        window = new UpdateUserPanel(this);

//        myForm.view();
    }

    protected User getUserToEdit() {
        return context.getCurrentUser();
    }

    public void updateUser() {
        User user = ((UpdateUserPanel) window).updateUser(context.getCurrentUser());
        context.getUserRepository().persist(user);
    }


}
