package ch.hearc.dev.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ch.hearc.dev.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
}