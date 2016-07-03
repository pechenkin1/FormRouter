package local.myworktech.formrouter.visual.abs;

import java.awt.*;

public interface Controller {
    void instantiateMyForm() throws Exception;

    void showChildFormOnMe(String child) throws Exception;

    Form getMyForm();

    void showDialogOn(String child, String parent);

    void instantiateMyDialog(Frame owner);
}
