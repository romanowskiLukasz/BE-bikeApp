package com.example.bikeapp.repo;

import com.example.bikeapp.entities.Achievement;
import com.example.bikeapp.entities.AchievementsUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AchievementsUsersRepo extends JpaRepository<AchievementsUsers, Long> {

    List<AchievementsUsers> findAllByUserId(Long userId);
}

