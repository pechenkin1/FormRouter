package local.myworktech.formrouter.service;

import local.myworktech.formrouter.entity.Credentials;
import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.impl.houses.HousesController;
import local.myworktech.formrouter.visual.impl.login.LoginController;
import local.myworktech.formrouter.visual.impl.root.ParentController;
import local.myworktech.formrouter.visual.impl.root.RootController;
import local.myworktech.formrouter.visual.impl.signup.SignupController;
import local.myworktech.formrouter.visual.impl.userInfoPanel.UserInfoPanelController;
import lombok.Getter;
import lombok.Setter;

public class Context {

    private Router router = Router.getInstance();

    private User testUser = User.getTestUser();

    @Getter
    @Setter
    private User currentUser;

    public static void startApplication() {
        Context context = new Context();
        context.start();
    }

    private void start() {
        registerControllers();
        currentUser = null;
        Controller rootController = router.get("rootFrame");
        rootController.createWindow();
    }

    private void registerControllers() {
        router.registerController("userInfoPanel", new UserInfoPanelController(this));
        router.registerController("rootFrame", new RootController(this));
        router.registerController("parentPanel", new ParentController(this));
        router.registerController("signupDialog", new SignupController(this));
        router.registerController("loginDialog", new LoginController(this));
        router.registerController("housesPanel", new HousesController(this));
    }

    public void quitProgram() {
        System.exit(0);
    }

    public boolean hasLogin(String login) {
        return login.equals(testUser.getCredentials().getUsername());
    }

    public boolean validCreds(Credentials credentials) {
        return credentials.getPassword().equals("test");
    }
}