package com.itf.schulung.onetomany.onetomanymapping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itf.schulung.onetomany.onetomanymapping.model.DrinkCategory;
import com.itf.schulung.onetomany.onetomanymapping.model.Product;

@RestController
public class MyRestController {
	@Autowired
	DrinkCategoryRepository drinkCatRepo;
	@Autowired 
	ProductRepository productRepo;
	
	@GetMapping(value="/getProducts")
	public List<Product> getProducts() {
		return productRepo.findAll();
	}
	@GetMapping(value="/getDrinkCategories")
	public List<DrinkCategory> getDrinkCategories() {
		return drinkCatRepo.findAll();
	}
	@PostMapping(value = "/postDrinkCategory", consumes = "application/json")
	public ResponseEntity<?> postCustomer(@RequestBody @Valid DrinkCategory receivedDrinkCategory) {
		productRepo.saveAll(receivedDrinkCategory.getProducts());
		drinkCatRepo.save(receivedDrinkCategory);
		
		return new ResponseEntity<>(receivedDrinkCategory, HttpStatus.OK);
	}
	@PostMapping(value = "/postProduct", consumes = "application/json")
	public ResponseEntity<?> postProduct(@RequestBody Product receivedProduct) {
		productRepo.save(receivedProduct);
		return new ResponseEntity<>(receivedProduct, HttpStatus.OK);
	}
	

}