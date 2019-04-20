package ch.hearc.dev.services;

import ch.hearc.dev.entity.Category;

public interface CategoryService {
	public void saveCategory(Category category);
	public Iterable<Category> findAll();
}
