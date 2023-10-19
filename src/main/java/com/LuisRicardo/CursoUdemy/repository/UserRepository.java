package com.LuisRicardo.CursoUdemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LuisRicardo.CursoUdemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
