package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int id);
    void insertUser(User user);
    void deleteUsersByID(int id);
}
