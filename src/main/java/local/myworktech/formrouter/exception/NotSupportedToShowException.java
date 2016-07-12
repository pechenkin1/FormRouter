package local.myworktech.formrouter.exception;

import local.myworktech.formrouter.visual.abs.forms.Frame;
import lombok.AllArgsConstructor;

import java.text.MessageFormat;

@AllArgsConstructor
public class NotSupportedToShowException extends RuntimeException {

    private Frame child;
    private Frame parent;

    @Override
    public String getMessage() {
        return MessageFormat.format("Not supported to show the \"{0}\" (as a child form) on the \"{1}\" (as a parent form).", child.getClass().getName(), parent.getClass().getName());
    }
}
