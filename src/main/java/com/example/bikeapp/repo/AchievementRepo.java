package com.example.bikeapp.repo;

import com.example.bikeapp.entities.Achievement;
import com.example.bikeapp.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AchievementRepo extends JpaRepository<Achievement, Long> {

}

