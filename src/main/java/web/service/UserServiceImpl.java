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

    private UserDAO user;

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(UserDAO user) {
        this.user = user;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return user.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return user.getUserById(id);
    }

    @Override
    @Transactional
    public void insertUser(User user) {
        this.user.insertUser(user);
    }

    @Override
    @Transactional
    public void deleteUsersByID(int id) {
         user.deleteUsersByID(id);
    }
}
