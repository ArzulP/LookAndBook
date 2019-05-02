package ch.hearc.dev.services;

import ch.hearc.dev.entity.Category;

public interface CategoryService {
	public Category findCategoryById(long id);
	public void saveCategory(Category category);
	public Iterable<Category> findAll();
	public void deleteById(Long id);
}
