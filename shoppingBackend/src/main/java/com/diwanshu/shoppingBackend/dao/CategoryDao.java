package com.diwanshu.shoppingBackend.dao;

import java.util.List;

import com.diwanshu.shoppingBackend.dto.Category;

public interface CategoryDao {

	
	public List<Category> list();

	public Category get(int id);
	
}
