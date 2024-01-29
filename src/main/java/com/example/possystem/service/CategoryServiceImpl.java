package com.example.possystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.possystem.entity.Category;
import com.example.possystem.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> fetchCategoryList() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public Category fetchCategoryById(Long categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(categoryId).get();
	}

	@Override
	public Category updateCategory(Long categoryId, Category category) {
		// TODO Auto-generated method stub
		Category categoryDB = categoryRepository.findById(categoryId).get();
		
//		categoryDB.setCategoryId(category.getCategoryId());
		categoryDB.setCategoryName(category.getCategoryName());
		
		return categoryRepository.save(categoryDB);
	}

	@Override
	public void deleteCategoryById(Long categoryId) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(categoryId);
		
	}

}
