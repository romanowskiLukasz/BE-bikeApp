package com.example.bikeapp.repo;

import com.example.bikeapp.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActivityRepo extends JpaRepository<Activity, Long> {

}

