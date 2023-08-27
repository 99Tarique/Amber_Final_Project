package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Product;
import com.example.serviceImpl.ProductImpl;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductImpl productImplcont;
	
	@PostMapping("/save")
	public Product saveData(@RequestBody Product product) {
		 Product products=productImplcont.saveData(product);
		 return product;
	}

	@GetMapping("/findBypName/{name}")
	public List<Product> findBypName(@PathVariable("name") String  pName) {
		return productImplcont.findBypName(pName);
	}
	
	@GetMapping("/getdatabyid/{pId}")
	
	public Optional<Product> getDataById(@PathVariable int  pId) {
		return productImplcont.getDataById(pId); 
	}
	
	@GetMapping("/getalldata")
	public List<Product> getAllData() {
		return productImplcont.getAllData(); 
	}
	
	@DeleteMapping("/delete/{pId}")
	public void deleteData(@PathVariable int pId) {
		productImplcont.deleteData(pId);
		
	}
	
	@PutMapping("/updatedata/{pId}")
	public Product updateData(@RequestBody Product product,@PathVariable int pId) {
	return	productImplcont.updateData(product,pId); 
	}
}
