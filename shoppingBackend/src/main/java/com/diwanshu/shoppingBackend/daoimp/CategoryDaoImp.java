package com.diwanshu.shoppingBackend.daoimp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Repository;

import com.diwanshu.shoppingBackend.dao.CategoryDao;
import com.diwanshu.shoppingBackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImp implements CategoryDao {

	
	private static List<Category> categories=new ArrayList<Category>();
	
	static{
		
		Category category=new Category();
		category.setId(1);
		category.setName("T-Shirt");
		category.setDescription("This is discription for t-shirt..!!");
		category.setImageurl("tshirt.png");
		
		categories.add(category);
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Shirt");
		category2.setDescription("This is discription for shirt..!!");
		category2.setImageurl("shirt.png");
		
		categories.add(category2);
		
		Category category3=new Category();
		category3.setId(3);
		category3.setName("jeans");
		category3.setDescription("This is discription for jeans..!!");
		category3.setImageurl("jeans.png");
		
		categories.add(category3);
		
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		
		for(Category category: categories){
			if(category.getId()==id) return category;
		}
		
		return null;
	}

}
