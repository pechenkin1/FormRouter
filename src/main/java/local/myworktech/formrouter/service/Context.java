package local.myworktech.formrouter.service;

import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.visual.abs.controllers.Controller;
import local.myworktech.formrouter.visual.controllers.*;
import lombok.Getter;
import lombok.Setter;

public class Context {

    private Router router = Router.getInstance();

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
    }

    public void quitProgram() {
        System.exit(0);
    }
}