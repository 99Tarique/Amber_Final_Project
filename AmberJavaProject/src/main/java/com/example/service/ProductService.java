package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entities.Product;

public interface ProductService {
	
	public Product saveData(Product product) ;

//	public Product getDataByName(String  pName) ;
	
	public Optional<Product> getDataById(int  pId);
	
	
	public List<Product> getAllData() ;
	
	
	public void deleteData(int pId) ;
	
	public Product updateData(Product product,int id) ;
	

}
