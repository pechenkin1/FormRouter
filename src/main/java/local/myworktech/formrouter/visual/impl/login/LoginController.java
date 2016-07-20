package local.myworktech.formrouter.visual.impl.login;

import local.myworktech.formrouter.entity.Credentials;
import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.exception.UserNotExistsException;
import local.myworktech.formrouter.exception.WrongPasswordException;
import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.iface.controllers.AbstractDialogController;

import javax.swing.*;
import java.awt.*;

public class LoginController extends AbstractDialogController {
    public LoginController(Context context) {
        super(context);
    }

    @Override
    public void createWindow(String owner) {
        window = new LoginDialog(this, router.get(owner).getWindow());
    }

    public void quitProgram() {
        context.quitProgram();
    }

    public void login(Credentials credentials) {
        try {
            checkExistance(credentials);
            authenticate(credentials);
            loginInner();
        } catch (UserNotExistsException | WrongPasswordException exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog((Component) window, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void loginInner() {
        context.setCurrentUser(User.getTestUser());
        ((Frame) router.get("rootFrame").getWindow()).setTitle("ttt");

        ((Window) window).dispose();
    }

    private void authenticate(Credentials credentials) throws WrongPasswordException {
        if (!context.validCreds(credentials))
            throw new WrongPasswordException(credentials);
    }

    private void checkExistance(Credentials credentials) throws UserNotExistsException {
        String username = credentials.getUsername();
        if (!context.hasLogin(username))
            throw new UserNotExistsException(username);
    }
}
