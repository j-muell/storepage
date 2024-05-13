package com.jason.storepage.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.storepage.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
