package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.entity.User;

import java.util.ArrayList;
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
    public void insertUser(User user) {

//        if (user.getId() == 0) {
//            user.setId(++AUTO_ID);
//            users.add(user);
//        } else {
//            user.setId(AUTO_ID);
//            users.set(user.getId() - 1, user);
//        }
    }




    @Override
    public List<User> deleteUsersByID(int id) {
//        AUTO_ID--;
//        users.remove(id-1);
//        return users;
        return null;
    }
}
