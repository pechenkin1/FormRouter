package local.myworktech.formrouter.visual.impl.root.menu;

import local.myworktech.formrouter.service.Context;
import lombok.Getter;

import java.util.Observable;
import java.util.Observer;

public class RootMenuController {

    private static RootMenuController rootMenuController;

    public static RootMenuController getInstance() {
        return rootMenuController;
    }

    public static void init(Context context) {
        rootMenuController = new RootMenuController(context);
    }

    private RootMenuController(Context context) {
        this.context = context;
    }

    private Context context;

    @Getter
    private RootMenu rootMenu;

    public void loggedOutMenu() {
        rootMenu = new RootMenu(this);
    }


    public void quitProgram() {
        context.quitProgram();
    }

    public void updateMenuToLoggedIn() {
        rootMenu.updateMenuToLoggedIn(context.getCurrentUser());
    }

    public void updateMenuToLoggedOut() {
        rootMenu.updateMenuToLoggedOut();
    }

    public void logout() {
        context.setLoggedOutUser();

    }
}
