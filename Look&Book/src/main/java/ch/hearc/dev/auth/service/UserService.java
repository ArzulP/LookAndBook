package ch.hearc.dev.auth.service;

import ch.hearc.dev.auth.model.User;

public interface UserService {
    void save(User user);
    public Iterable<User> findAll();
    User findByUsername(String username);
}