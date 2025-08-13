package com.oopJava.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oopJava.course.entities.Product;
import com.oopJava.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> list= service.finaAll();
		
		return ResponseEntity.ok().body(list);
	}
	
@GetMapping(value= "/{id}")
public ResponseEntity<Product> findById(@PathVariable Long id){
	Product obj = service.findBYId(id);
	return ResponseEntity.ok().body(obj);
	
	
}

}
