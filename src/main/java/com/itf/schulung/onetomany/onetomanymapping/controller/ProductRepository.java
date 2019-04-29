package com.itf.schulung.onetomany.onetomanymapping.controller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.itf.schulung.onetomany.onetomanymapping.model.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
}
