package ch.hearc.dev.services;


import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hearc.dev.entity.Artwork;
import ch.hearc.dev.entity.Category;
import ch.hearc.dev.repository.CategoryRepository;


@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void saveCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public Category findCategoryById(long id) {
		return categoryRepository.findById(id).get();
	}

}
