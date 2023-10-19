package com.LuisRicardo.CursoUdemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LuisRicardo.CursoUdemy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
