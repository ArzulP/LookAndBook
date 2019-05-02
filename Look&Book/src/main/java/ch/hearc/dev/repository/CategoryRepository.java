package ch.hearc.dev.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import ch.hearc.dev.entity.Category;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository <Category, Long>{
	@Modifying
	@Transactional
	void deleteById(Long id);
}
