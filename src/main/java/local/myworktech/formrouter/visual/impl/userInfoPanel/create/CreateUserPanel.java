package local.myworktech.formrouter.visual.impl.userInfoPanel.create;

import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.impl.userInfoPanel.AbstractEditUserInfoPanel;

public class CreateUserPanel extends AbstractEditUserInfoPanel {

    public CreateUserPanel(Controller controller) {
        super(controller);
    }

    @Override
    public void postConstruct() {
        setName("createUserPanel");
    }
}
