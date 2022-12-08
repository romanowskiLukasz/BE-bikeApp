package com.example.bikeapp.repo;

import com.example.bikeapp.entities.Bike;
import com.example.bikeapp.entities.BikePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Long> {
    List<Bike> findByUserId(Long id);

}

