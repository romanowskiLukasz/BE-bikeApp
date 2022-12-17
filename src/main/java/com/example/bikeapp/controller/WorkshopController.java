package com.example.bikeapp.controller;

import com.example.bikeapp.dtos.BikePartDTO;
import com.example.bikeapp.dtos.BikesDTO;
import com.example.bikeapp.entities.Bike;
import com.example.bikeapp.entities.BikePart;
import com.example.bikeapp.repo.BikeRepo;
import com.example.bikeapp.service.WorkshopService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addBike")
    public void addBike(@RequestBody Bike bike) {
        workshopService.addBike(bike);
    }

    @DeleteMapping("/deleteBike/{id}")
    public void deleteBike(@PathVariable Long id) {
        workshopService.deleteBike(id);
    }
    public Bike getBikeById(Long id) {
        return null;
    }

    public Bike updateBike(Bike bike) {
        return null;
    }


}

