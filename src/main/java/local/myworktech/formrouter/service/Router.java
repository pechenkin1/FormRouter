package local.myworktech.formrouter.service;

import local.myworktech.formrouter.visual.abs.Controller;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Router {

    private static Router router = new Router();
    private ControllersProvider controllersProvider = new ControllersProvider();

    public static Router getInstance() {
        return router;
    }

    void registerController(String name, Controller controller) {
        controllersProvider.registerController(name, controller);
    }

    void showStartFrame() throws Exception {
        Controller c = controllersProvider.get("rootFrame");
        c.instantiateMyForm();
        c.getMyForm().view();
    }

    public Controller get(String name) {
        return controllersProvider.get(name);
    }


    private class ControllersProvider {

        private Map<String, Controller> controllersMap = new HashMap<>();

        void registerController(String name, Controller controller) {
            controllersMap.put(name, controller);
        }

        private Controller get(String name) {
            return controllersMap.get(name);
        }
    }
}