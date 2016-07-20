package local.myworktech.formrouter.exception;

import local.myworktech.formrouter.entity.Credentials;
import lombok.AllArgsConstructor;

import java.text.MessageFormat;

@AllArgsConstructor
public class WrongPasswordException extends Exception {

    private Credentials credentials;

    @Override
    public String getMessage() {
        return MessageFormat.format("Incorrect password for {0}!", credentials.getUsername());
    }
}