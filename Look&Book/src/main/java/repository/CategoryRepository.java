package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.hearc.dev.entity.Category;

public interface CategoryRepository extends JpaRepository <Category, Long>{

}
