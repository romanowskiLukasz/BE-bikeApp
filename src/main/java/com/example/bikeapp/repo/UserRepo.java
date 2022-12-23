package com.example.bikeapp.repo;

import com.example.bikeapp.entities.User;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {


    User getById(Long id);



    User findByEmail(String email);
}
