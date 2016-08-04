package local.myworktech.formrouter.entity;

import java.util.Observable;

public class CurrentUser {

    private User currentUser;

    public User getUser() {
        return currentUser;
    }

    public void setUser(User user) {
        currentUser = user;
    }
}
