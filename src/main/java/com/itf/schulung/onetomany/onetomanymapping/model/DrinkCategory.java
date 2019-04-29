package com.itf.schulung.onetomany.onetomanymapping.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class DrinkCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categoryID;
	
	@OneToMany(mappedBy = "drinkCategory")
	private List<Product> products;
	@NotNull
	private String name;

	public Long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
