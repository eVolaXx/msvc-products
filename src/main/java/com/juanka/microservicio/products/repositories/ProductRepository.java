package com.juanka.microservicio.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.juanka.microservicio.products.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
