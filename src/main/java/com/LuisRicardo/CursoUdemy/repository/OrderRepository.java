package com.LuisRicardo.CursoUdemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LuisRicardo.CursoUdemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
