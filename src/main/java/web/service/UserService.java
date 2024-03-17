package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void insertUser(User user);
    List<User> deleteUsersByID(int id);
}
