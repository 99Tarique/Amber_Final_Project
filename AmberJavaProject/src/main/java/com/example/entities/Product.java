package com.example.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pId;
	private String pName;
	private int pQuantity;
	private int pPrice;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public Product(int pId, String pName, int pQuantity, int pPrice) {
		super();
		//this.pId = pId;
		this.pName = pName;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pQuantity=" + pQuantity + ", pPrice=" + pPrice + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
    
	
	
	
	
	
	
	
	

}
