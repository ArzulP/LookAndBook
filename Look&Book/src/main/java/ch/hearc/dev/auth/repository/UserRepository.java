package ch.hearc.dev.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.hearc.dev.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    
}