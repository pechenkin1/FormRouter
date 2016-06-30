package local.myworktech.formrouter.visual.abs;

public interface Controller {
    void instantiateMyForm();

    void showChildFormOnMe(String child);

    Form getMyForm();
}
