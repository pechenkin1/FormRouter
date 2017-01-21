package local.myworktech.formrouter.visual.impl.root.menu;

import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.service.Router;
import local.myworktech.formrouter.visual.iface.controllers.Controller;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

public class RootMenuController {

    private static RootMenuController rootMenuController;

    public static RootMenuController getInstance() {
        return rootMenuController;
    }

    public static void init(Context context) {
        if (rootMenuController == null)
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

    public User getCurrentUser() {
        return context.getCurrentUser();
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

    public void showHouses() {
        Router router = Router.getInstance();
        Controller parent = router.get("parentPanel");
        parent.add("housesPanel");
        ((Component) parent.getWindow()).repaint();
    }

    public void showLoginDialog() {
        Router router = Router.getInstance();
        ((JFrame) router.get("rootFrame").getWindow()).repaint();
        Controller loginDialog = router.get("loginDialog");
        loginDialog.addDialog("rootFrame");
    }

    public void editUserInfo() {
        Router router = Router.getInstance();
        ((JFrame) router.get("rootFrame").getWindow()).repaint();
        Controller userInfoDialog = router.get("userInfoDialog");
        userInfoDialog.addDialog("rootFrame");
    }

    public void showTenants() {
        Router router = Router.getInstance();
        Controller parent = router.get("parentPanel");
        parent.add("tenantsPanel");
        ((Component) parent.getWindow()).repaint();
    }
}
//todo search for "getWindow()).repaint();" and refactor it