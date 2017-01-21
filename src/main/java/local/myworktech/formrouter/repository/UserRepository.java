package local.myworktech.formrouter.repository;


import local.myworktech.formrouter.entity.User;

import javax.persistence.EntityManagerFactory;

public class UserRepository extends RepositoryImpl {
    public UserRepository(EntityManagerFactory factory) {
        super(factory);

    }

    public User findUser(String username) {
        return createQuery("FROM User u WHERE u.username = :username", User.class)
                .setParameter("username", username)
                .getSingleResult();
    }

    public User findUser2(String username) {
        return createQuery(User.class)
                .setParameter("username", username)
                .getSingleResult();
    }

    public User findByLogin(String login) {
        return createQuery("FROM User u INNER JOIN FETCH u.credentials c  WHERE    c.username = :login", User.class)
                .setParameter("login", login)
                .getSingleResult();
    }
}
