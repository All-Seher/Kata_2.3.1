package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void insertUser(User user);
    List<User> deleteUsersByID(int id);
}
