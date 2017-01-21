package local.myworktech.formrouter.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence_unit");

    public static EntityManagerFactory getFactory() {
        return factory;
    }


}
