package local.myworktech.formrouter.visual.abs;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.service.Router;
import lombok.Getter;

import java.awt.*;


public abstract class AbstractController implements Controller {
    protected Context context;
    protected Router router = Router.getInstance();
    @Getter
    protected Form myForm;

    public AbstractController(Context context) {
        this.context = context;
    }

    public abstract void instantiateMyForm() throws Exception;

    public abstract void instantiateMyDialog(Frame owner);

    @Override
    public void showChildFormOnMe(String child) throws Exception {
        Controller childController = router.get(child);
        childController.instantiateMyForm();
        try {
            myForm.addForm(childController.getMyForm());
            childController.getMyForm().view();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDialogOn(String child, String owner) {
        Controller rootController = router.get(owner);
        try {
            Controller dialogController = router.get(child);
            dialogController.instantiateMyDialog((Frame) rootController.getMyForm());
            dialogController.getMyForm().view();
            ((Component) dialogController.getMyForm()).setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}