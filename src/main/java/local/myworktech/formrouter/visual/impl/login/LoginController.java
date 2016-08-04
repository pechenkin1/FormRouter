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
            login0(credentials);
            ((Window) window).dispose();

        } catch (UserNotExistsException | WrongPasswordException exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog((Component) window, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void login0(Credentials credentials) throws UserNotExistsException, WrongPasswordException {
        checkExistence(credentials);
        authenticate(credentials);
        context.setLoggedInUser(User.getTestUser());
    }

    private void authenticate(Credentials credentials) throws WrongPasswordException {
        if (!validCreds(credentials))
            throw new WrongPasswordException(credentials);
    }

    private void checkExistence(Credentials credentials) throws UserNotExistsException {
        String username = credentials.getUsername();
        if (!hasLogin(username))
            throw new UserNotExistsException(username);
    }

    private boolean hasLogin(String login) {
        return login.equals(testUser.getCredentials().getUsername());
    }

    private boolean validCreds(Credentials credentials) {
        return credentials.getPassword().equals("test");
    }

    private User testUser = User.getTestUser();
}