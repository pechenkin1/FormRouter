package local.myworktech.formrouter.visual.forms;

import local.myworktech.formrouter.visual.abs.Form;
import lombok.AllArgsConstructor;

import java.text.MessageFormat;

@AllArgsConstructor
class NotSupportedToShowException extends Exception {

    private Form child;
    private Form parent;

    @Override
    public String getMessage() {
        return MessageFormat.format("Not supported to show the \"{0}\" (as a child form) on the \"{1}\" (as a parent form).", child.getClass().getName(), parent.getClass().getName());
    }
}
