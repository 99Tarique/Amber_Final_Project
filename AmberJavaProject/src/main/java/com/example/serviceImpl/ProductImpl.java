package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;

@Service
public class ProductImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepositoryimpl;
	
	public Product saveData(Product product) {
		Product products=null;
		try {
		
	     products= productRepositoryimpl.save(product);
	    
	}
		catch(Exception e){
			e.printStackTrace();
			}
		return products;
			
		}
	public List<Product> findBypName(String  pName) {
		return productRepositoryimpl.findBypName(pName); 
	}
	
	public Optional<Product> getDataById(int  pId) {
		return productRepositoryimpl.findById(pId); 
	}
	
	
	public List<Product> getAllData() {
		return productRepositoryimpl.findAll(); 
	}
	
	
	public void deleteData(int pId) {
		productRepositoryimpl.deleteById(pId);
	}
	
	@Override
	public Product updateData(Product product,int id) {
		// TODO Auto-generated method stub
		Product products=null;
		product.setpId(id);
		products=productRepositoryimpl.save(product);
		return products;
	}
	

	




}
