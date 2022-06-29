package com.triersistemas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triersistemas.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
