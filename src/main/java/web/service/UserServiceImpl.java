package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.entity.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }



    @Override
    @Transactional
    public void insertUser(User user) {
        this.userDAO.insertUser(user);
    }

    @Override
    @Transactional
    public void deleteUsersByID(int id) {
         userDAO.deleteUsersByID(id);
    }
}
