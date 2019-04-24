package ch.hearc.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.hearc.dev.entity.Category;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository <Category, Long>{
	
}
