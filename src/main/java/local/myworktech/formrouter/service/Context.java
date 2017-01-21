package local.myworktech.formrouter.service;

import local.myworktech.formrouter.entity.Credentials;
import local.myworktech.formrouter.entity.CurrentUser;
import local.myworktech.formrouter.entity.Gender;
import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.repository.Factory;
import local.myworktech.formrouter.repository.UserRepository;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import local.myworktech.formrouter.visual.impl.editUserInfoDialog.UserInfoController;
import local.myworktech.formrouter.visual.impl.houses.HousesController;
import local.myworktech.formrouter.visual.impl.login.LoginController;
import local.myworktech.formrouter.visual.impl.root.ParentController;
import local.myworktech.formrouter.visual.impl.root.RootController;
import local.myworktech.formrouter.visual.impl.root.menu.RootMenuController;
import local.myworktech.formrouter.visual.impl.signup.SignupController;
import local.myworktech.formrouter.visual.impl.tenants.TenantsController;
import local.myworktech.formrouter.visual.impl.userInfoPanel.create.CreateUserPanelController;
import local.myworktech.formrouter.visual.impl.userInfoPanel.update.UpdateUserPanelController;

import java.text.MessageFormat;

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
        Controller parentController = router.get("parentPanel");
        ((ParentController) parentController).clear();

        Controller loginDialog = router.get("loginDialog");
        loginDialog.addDialog("rootFrame");
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
        initRepositories();
        initDb();
        currentUser = new CurrentUser();
        Controller rootController = router.get("rootFrame");
        rootController.createWindow();

        Controller loginDialog = router.get("loginDialog");
        loginDialog.addDialog("rootFrame");
    }

    private void initRepositories() {
        userRepository = new UserRepository(Factory.getFactory());
    }

    private void registerControllers() {
        router.registerController("rootFrame", new RootController(this));
        router.registerController("signupDialog", new SignupController(this));
        router.registerController("loginDialog", new LoginController(this));
        router.registerController("userInfoDialog", new UserInfoController(this));

        router.registerController("parentPanel", new ParentController(this));
        router.registerController("createUserPanel", new CreateUserPanelController(this));
        router.registerController("updateUserPanel", new UpdateUserPanelController(this));
        router.registerController("housesPanel", new HousesController(this));
        router.registerController("tenantsPanel", new TenantsController(this));

        RootMenuController.init(this);
    }

    private void initDb() {
        User user = new User();
        user.setFirstName("Joe");
        user.setLastName("Gunner");
        user.setMiddleName("Johnson");
        user.setGender(Gender.Male);
        user.setEmail("joe@friends.com");
        user.setPhone("+7 999 123-44-55");
        user.setCredentials(new Credentials("joe", "god"));

        try {
            userRepository.persist(user);
        }
        catch (Exception e) {
            System.out.println( String.format("ERROR: couldn't persist user %s with credentials %s", user.getShortUserInfo(), user.getCredentials()));
        }
    }

    public void quitProgram() {
        System.exit(0);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    private UserRepository userRepository;
}

//todo createUserPanel on a signupDialog; updateUserPanel on a userInfoDialog; both of these panels extend the same parent