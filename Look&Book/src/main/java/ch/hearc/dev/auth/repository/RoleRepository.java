package ch.hearc.dev.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.hearc.dev.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}