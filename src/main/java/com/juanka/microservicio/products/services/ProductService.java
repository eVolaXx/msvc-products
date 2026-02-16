package com.juanka.microservicio.products.services;

import java.util.List;
import java.util.Optional;

import com.juanka.microservicio.products.entities.Product;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);

}
