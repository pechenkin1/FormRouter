package local.myworktech.formrouter.exception;

import lombok.AllArgsConstructor;

import java.text.MessageFormat;

@AllArgsConstructor
public class UserNotExistsException extends Exception {

    private String login;

    @Override
    public String getMessage() {
        return MessageFormat.format("User {0} not exists!", login);
    }
}
