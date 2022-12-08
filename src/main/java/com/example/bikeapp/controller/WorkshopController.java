package com.example.bikeapp.controller;

import com.example.bikeapp.dtos.BikePartDTO;
import com.example.bikeapp.dtos.BikesDTO;
import com.example.bikeapp.entities.Bike;
import com.example.bikeapp.entities.BikePart;
import com.example.bikeapp.repo.BikeRepo;
import com.example.bikeapp.service.WorkshopService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class WorkshopController {
    private final WorkshopService workshopService;

    public WorkshopController(WorkshopService workshopService) {
        this.workshopService = workshopService;
    }


    @GetMapping("/getAllBikes/{userId}")
    public List<BikesDTO> getAllBikes(@PathVariable Long userId) {
        return workshopService.getAllBikes(userId);
    }

    @GetMapping("/getUnusedParts")
    public List<BikePart> getUnusedParts() {
        return workshopService.getUnusedParts();
    }

    public Bike getBikeById(Long id) {
        return null;
    }

    public Bike addBike(Bike bike) {
        return null;
    }

    public Bike updateBike(Bike bike) {
        return null;
    }

    public void deleteBike(Long id) {
    }

}

