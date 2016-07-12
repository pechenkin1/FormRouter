package local.myworktech.formrouter.visual.controllers;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.visual.abs.controllers.AbstractDialogController;
import local.myworktech.formrouter.visual.forms.LoginDialog;

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

    public void login(String login, String password) {//throws UserNotExistsException, WrongPasswordException {
//        checkExistance(login);
//        Credentials credentials = new Credentials(login, password);
//        authenticate(credentials);

    }
}
