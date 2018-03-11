package dao;

import models.Auto;
import models.User;
import utils.HibernateUtil;
import javax.persistence.EntityManager;
import java.util.List;

public class UserDAO {

    public User findById(int id) {
        return HibernateUtil.getEm().find(User.class, id);
    }

    public void save(User user) {
        EntityManager em = HibernateUtil.getEm();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public void update(User user) {
        EntityManager em = HibernateUtil.getEm();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(User user) {
        EntityManager em = HibernateUtil.getEm();
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
        em.close();
    }

    public Auto findAutoById(int id) {
        return HibernateUtil.getEm().find(Auto.class, id);
    }

    public List<User> findAll() {
        return HibernateUtil.getEm().createQuery("from User").getResultList();
    }

}
