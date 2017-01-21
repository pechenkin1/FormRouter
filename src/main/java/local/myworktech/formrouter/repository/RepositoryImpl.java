package local.myworktech.formrouter.repository;


import local.myworktech.formrouter.entity.PersistableEntity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


public class RepositoryImpl implements Repository {

    public RepositoryImpl(EntityManagerFactory factory) {

        serverName = factory.getProperties().get("hibernate.connection.url").toString();
        entityManager = factory.createEntityManager();
    }

    public String getServerName() {
        return serverName;
    }

    public void persist(PersistableEntity entity) {

        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
            throw new RuntimeException("Inner exception!", e);
//            JOptionPane.showMessageDialog(AppController.getAppWindow(), e.getCause(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void update(PersistableEntity entity) {

        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            entityManager.merge(entity);
            entityTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
//            JOptionPane.showMessageDialog(AppController.getAppWindow(), e.getCause(), "Ошибка", JOptionPane.ERROR_MESSAGE);

        }

    }

    public <T> List<T> findAll(String query, Class<T> resultClass) {

        EntityTransaction entityTransaction = entityManager.getTransaction();
        List<T> list = null;
        try {
            list = entityManager.createQuery(query, resultClass).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
//            JOptionPane.showMessageDialog(AppController.getAppWindow(), e.getCause(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }

        return list;
    }

    public <T> T findOne(String query, Class<T> resultClass) {

        EntityTransaction entityTransaction = entityManager.getTransaction();
        T entity = null;
        try {

            entity = entityManager.createQuery(query, resultClass).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
//            JOptionPane.showMessageDialog(AppController.getAppWindow(), e.getCause(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }

        return entity;
    }

    public <T> T findWithCriteria(CriteriaQuery<T> criteriaQuery) {

        EntityTransaction entityTransaction = entityManager.getTransaction();
        T entity = null;
        try {
            entity = entityManager.createQuery(criteriaQuery).getSingleResult();
        } catch (NoResultException e) {
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
//            JOptionPane.showMessageDialog(AppController.getAppWindow(), e.getCause(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }

        return entity;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public <T> TypedQuery<T> createQuery(String query, Class<T> clazz) {

        return entityManager.createQuery(query, clazz);
    }

    public <T> TypedQuery<T> createQuery(Class<T> clazz) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(clazz);
        return entityManager.createQuery(criteriaQuery);
    }

    protected String serverName;
    protected EntityManager entityManager;

}
