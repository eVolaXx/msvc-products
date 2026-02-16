package com.juanka.microservicio.products.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.juanka.microservicio.products.entities.Product;
import com.juanka.microservicio.products.services.ProductService;



@RestController
public class ProductController {
    final private ProductService service;
    
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> list() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> details(@PathVariable Long id) {
        Optional<Product> prodOptional = this.service.findById(id);

        if (prodOptional.isPresent()) {
            return ResponseEntity.ok(prodOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }
    
    
}
