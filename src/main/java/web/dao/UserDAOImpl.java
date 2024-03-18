package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.entity.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
//    private static final List users = new ArrayList<>();
//    private static int AUTO_ID = 1;
//
//    static  {
//        User user = new User();
//        user.setId(1);
//        user.setName("1");
//        user.setSurName("1");
//        users.add(user);
//    }

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public void insertUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }


    @Override
    public void deleteUsersByID(int id) {
        Session session = sessionFactory.getCurrentSession();
        User userForDelete = session.get(User.class, id);
        session.remove(userForDelete);
    }
}
