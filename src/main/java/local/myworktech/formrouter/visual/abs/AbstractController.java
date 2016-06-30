package local.myworktech.formrouter.visual.abs;

import local.myworktech.formrouter.service.Context;
import local.myworktech.formrouter.service.Router;
import lombok.Getter;


public abstract class AbstractController implements Controller {
    protected Context context;
    protected Router router = Router.getInstance();

    @Getter
    protected Form myForm;

    public AbstractController(Context context) {
        this.context = context;
    }

    @Override
    public void showChildFormOnMe(String child) {
        Controller childController = router.get(child);
        childController.instantiateMyForm();
        tryAddAndShow(childController);
    }

    private void tryAddAndShow(Controller childController) {
        try {
            myForm.addForm(childController.getMyForm());
            childController.getMyForm().view();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}