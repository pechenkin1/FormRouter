package local.myworktech.formrouter.visual.impl.login;

import local.myworktech.formrouter.entity.Credentials;
import local.myworktech.formrouter.entity.User;
import local.myworktech.formrouter.exception.UserNotExistsException;
import local.myworktech.formrouter.exception.WrongPasswordException;
import local.myworktech.formrouter.repository.UserRepository;
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
            User user = checkExistence(credentials);
            authenticate(credentials, user);
            context.setLoggedInUser(user);
            ((Window) window).dispose();
        } catch (UserNotExistsException | WrongPasswordException exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog((Component) window, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private User checkExistence(Credentials credentials) throws UserNotExistsException {
        String username = credentials.getUsername();
        return context.getUserRepository().findByLogin(username);
    }

    private void authenticate(Credentials credentials, User user) throws WrongPasswordException {
       if (!credentials.getPassword().equals(user.getCredentials().getPassword()))
            throw new WrongPasswordException(credentials);
    }

}