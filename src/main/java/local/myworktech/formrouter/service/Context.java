package local.myworktech.formrouter.service;

import local.myworktech.formrouter.entity.CurrentUser;
import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.impl.houses.HousesController;
import local.myworktech.formrouter.visual.impl.login.LoginController;
import local.myworktech.formrouter.visual.impl.root.ParentController;
import local.myworktech.formrouter.visual.impl.root.RootController;
import local.myworktech.formrouter.visual.impl.root.menu.RootMenuController;
import local.myworktech.formrouter.visual.impl.signup.SignupController;
import local.myworktech.formrouter.visual.impl.userInfoPanel.UserInfoPanelController;

public class Context {

    private Router router = Router.getInstance();

    private CurrentUser currentUser;

    public void setLoggedInUser(User user) {
        currentUser.setUser(user);
        RootMenuController rootMenuController = RootMenuController.getInstance();
        rootMenuController.updateMenuToLoggedIn();
    }

    public void setLoggedOutUser() {
        currentUser.setUser(null);
        RootMenuController rootMenuController = RootMenuController.getInstance();
        rootMenuController.updateMenuToLoggedOut();
    }

    public User getCurrentUser() {
        return currentUser.getUser();
    }

    public static void startApplication() {
        Context context = new Context();
        context.start();
    }

    private void start() {
        registerControllers();
        currentUser = new CurrentUser();
        Controller rootController = router.get("rootFrame");
        rootController.createWindow();
        rootController.add("loginDialog", "rootFrame");
    }

    private void registerControllers() {
        router.registerController("userInfoPanel", new UserInfoPanelController(this));
        router.registerController("rootFrame", new RootController(this));
        router.registerController("parentPanel", new ParentController(this));
        router.registerController("signupDialog", new SignupController(this));
        router.registerController("loginDialog", new LoginController(this));
        router.registerController("housesPanel", new HousesController(this));

        RootMenuController.init(this);
    }

    public void quitProgram() {
        System.exit(0);
    }




}