package com.example.bikeapp.service;

import com.example.bikeapp.dtos.BikePartDTO;
import com.example.bikeapp.dtos.BikesDTO;
import com.example.bikeapp.entities.Bike;
import com.example.bikeapp.entities.BikePart;
import com.example.bikeapp.repo.BikePartRepo;
import com.example.bikeapp.repo.BikeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkshopService {

    private final BikePartRepo bikePartRepo;
    private final BikeRepo bikeRepo;

    public WorkshopService(BikePartRepo bikePartRepo, BikeRepo bikeRepo) {
        this.bikePartRepo = bikePartRepo;
        this.bikeRepo = bikeRepo;
    }

    public List<BikesDTO> getAllBikes(Long userId) {

        return bikeRepo.findByUserId(userId).stream().map(bike -> BikesDTO.builder()
                .brand(bike.getBrand())
                .model(bike.getModel())
                .year(bike.getYear())
                .weight(bike.getWeight())
                .size(bike.getSize())
                .img(bike.getImg())
                .dateOfPurchase(bike.getDateOfPurchase())
                .bikeParts(bikePartRepo.getBikePartsByBikeId(bike.getId()))
                .build()).toList();
    }

    public List<BikePart> getUnusedParts() {
        return bikePartRepo.getBikePartsByBikeId(-1L).stream().toList();
    }
}
