package local.myworktech.formrouter.service;

import local.myworktech.formrouter.visual.controllers.ParentController;
import local.myworktech.formrouter.visual.controllers.RootController;
import local.myworktech.formrouter.visual.controllers.UserInfoPanelController;

public class Context {

    private Router router = Router.getInstance();

    public static void startApplication() {
        Context context = new Context();
        context.start();
    }

    private void start() {
        registerControllers();
        router.showStartFrame();
    }

    private void registerControllers() {
        router.registerController("userInfoPanel", UserInfoPanelController.class);
        router.registerController("rootFrame", RootController.class);
        router.registerController("parentPanel", ParentController.class);
    }
}