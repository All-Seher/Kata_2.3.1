package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void insertUser(User user);
    void deleteUsersByID(int id);
}
