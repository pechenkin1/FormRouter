package local.myworktech.formrouter.service;

import local.myworktech.formrouter.visual.controllers.*;

public class Context {

    private Router router = Router.getInstance();

    public static void startApplication() {
        Context context = new Context();
        context.start();
    }

    private void start() {
        registerControllers();
        try {
            router.showStartFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void registerControllers() {
        router.registerController("userInfoPanel", new UserInfoPanelController(this));
        router.registerController("rootFrame", new RootController(this));
        router.registerController("parentPanel", new ParentController(this));
        router.registerController("signupDialog", new SignupController(this));
        router.registerController("loginDialog", new LoginController(this));

    }
}