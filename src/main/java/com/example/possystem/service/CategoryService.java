package com.example.possystem.service;

import java.util.List;

import com.example.possystem.entity.Category;

public interface CategoryService {

	public List<Category> fetchCategoryList();

	public Category createCategory(Category category);

	public Category fetchCategoryById(Long categoryId);

	public Category updateCategory(Long categoryId, Category category);

	public void deleteCategoryById(Long categoryId);

}
