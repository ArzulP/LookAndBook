package ch.hearc.dev.auth.service;

import ch.hearc.dev.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}