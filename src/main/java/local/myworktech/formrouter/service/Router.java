package local.myworktech.formrouter.service;

import local.myworktech.formrouter.visual.abs.Controller;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Router<T extends Controller> {

    private static Router router = new Router();
    private ControllersProvider controllersProvider = new ControllersProvider();

    public static Router getInstance() {
        return router;
    }

    void registerController(String name, Class<T> controllerClass) {
        controllersProvider.registerController(name, controllerClass);
    }

    void showStartFrame() {
        Controller c = controllersProvider.get("rootFrame");
        c.instantiateMyForm();
        c.getMyForm().view();
    }

    public T get(String name) {
        return controllersProvider.get(name);
    }

    private class ControllersProvider {

        private Map<String, Class<T>> controllersMap = new HashMap<>();

        void registerController(String name, Class<T> controllerClass) {
            controllersMap.put(name, controllerClass);
        }

        private T get(String name) {
            Class<T> clazz = controllersMap.get(name);
            try {
                return clazz.getDeclaredConstructor(Context.class).newInstance(new Context());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}