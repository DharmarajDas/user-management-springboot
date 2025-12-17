package com.example.usermanagement.service;

import com.example.usermanagement.exception.UserNotFoundException;
import com.example.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(int id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with id: " + id));
    }

    public User updateUser(int id, User user) {
        User existing = getUserById(id);
        existing.setName(user.getName());
        existing.setAge(user.getAge());
        return repository.save(existing);
    }

    public void deleteUser(int id) {
        User user = getUserById(id);
        repository.delete(user);
    }
}
