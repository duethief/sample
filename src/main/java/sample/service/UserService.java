package sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.entities.User;
import sample.persistence.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User userToAdd) {
        return userMapper.addUser(userToAdd);
    }

    public User getUser(int userId) {
        return userMapper.getUser(userId);
    }
}