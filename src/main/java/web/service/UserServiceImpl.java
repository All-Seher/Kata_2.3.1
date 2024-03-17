package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO user;

    @Autowired
    public UserServiceImpl(UserDAO user) {
        this.user = user;
    }

    @Override
    public List<User> getAllUsers() {
        return user.getAllUsers();
    }

    @Override
    public void insertUser(User user) {
        this.user.insertUser(user);
    }

    @Override
    public List<User> deleteUsersByID(int id) {
        return user.deleteUsersByID(id);
    }
}
