package com.example.possystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.possystem.entity.Category;
import com.example.possystem.service.CategoryService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategory(category);	
	}
	
	@GetMapping
	public List<Category> fetchProductList() {
		return categoryService.fetchCategoryList();
	}
	
	@GetMapping("/{id}")
	public Category fetchCategoryById(@PathVariable("id") Long categoryId) {
		return categoryService.fetchCategoryById(categoryId);
	}
	
	@PutMapping("/{id}")
	public Category updateCategory(@PathVariable("id") Long categoryId, @RequestBody Category category) {
		return categoryService.updateCategory(categoryId, category);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCategory(@PathVariable("id") Long categoryId) {
		categoryService.deleteCategoryById(categoryId);
		return "Category Deleted Successfully";
	}

}
