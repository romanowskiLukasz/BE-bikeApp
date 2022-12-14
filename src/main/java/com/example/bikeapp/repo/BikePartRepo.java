package com.example.bikeapp.repo;

import com.example.bikeapp.dtos.BikePartDTO;
import com.example.bikeapp.entities.BikePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikePartRepo extends JpaRepository<BikePart, Long> {

    List<BikePart> getBikePartsByBikeId(Long id);
    BikePart findByBikeIdAndCategory(Long id,String category);
    BikePart findByBikeId(Long id);
    List<BikePartDTO> getBikePartsDTOByBikeId(Long id);
//    List<BikePart> getBikePartsByBikeIdGreaterThan0L(Long id);
}

