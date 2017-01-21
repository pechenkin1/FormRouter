package local.myworktech.formrouter.visual.impl.userInfoPanel.update;

import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.impl.userInfoPanel.AbstractEditUserInfoPanel;

public class UpdateUserPanel extends AbstractEditUserInfoPanel {

    public UpdateUserPanel(Controller controller) {
        super(controller);
    }

    @Override
    public void postConstruct() {
        setName("updateUserPanel");
        User user = ((UpdateUserPanelController) controller).getUserToEdit();
        fillTheFormWithCurrentUser(user);
    }
}
