package com.itf.schulung.onetomany.onetomanymapping.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productID;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="categoryID")
	private DrinkCategory drinkCategory;
	
	private String productName;

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public DrinkCategory getDrinkCategory() {
		return drinkCategory;
	}

	public void setDrinkCategory(DrinkCategory drinkCategory) {
		this.drinkCategory = drinkCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
