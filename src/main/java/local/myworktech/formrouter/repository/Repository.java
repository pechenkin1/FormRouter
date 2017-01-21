package local.myworktech.formrouter.repository;


import local.myworktech.formrouter.entity.PersistableEntity;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public interface Repository {

    String getServerName();

    void persist(PersistableEntity entity);

    void update(PersistableEntity entity);

    <T> List<T> findAll(String query, Class<T> resultClass);

    <T> T findOne(String query, Class<T> resultClass);

    <T> T findWithCriteria(CriteriaQuery<T> criteriaQuery);

    EntityManager getEntityManager();


}
