package com.example.bikeapp.controller;

import com.example.bikeapp.dtos.*;
import com.example.bikeapp.entities.Bike;
import com.example.bikeapp.entities.BikePart;
import com.example.bikeapp.entities.User;
import com.example.bikeapp.repo.BikeRepo;
import com.example.bikeapp.service.WorkshopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/deletePart/{id}")
    public void deletePart(@PathVariable Long id) {
        workshopService.deletePart(id);
    }

    @PostMapping("/addPart")
    public void addBike(@RequestBody AddBikePartDTO addBikePartDTO) {
        workshopService.addBikePart(addBikePartDTO);
    }

    @PutMapping("/updateBikePart/{partId}/{bikeId}/{partCategory}")
    public void updateBikePart(@PathVariable Long partId, @PathVariable Long bikeId, @PathVariable String partCategory) {
        workshopService.updateBikePart(partId, bikeId, partCategory);
    }

    @PostMapping("/user/login")
    public User loginUser(@RequestBody LoginDTO loginModel) {
        return workshopService.loginUser(loginModel);
    }

    @PostMapping("/user/register")
    public void registerUser(@RequestBody RegisterDTO registerDTO) {
         workshopService.registerUser(registerDTO);
    }

    public Bike getBikeById(Long id) {
        return null;
    }

    public Bike updateBike(Bike bike) {
        return null;
    }


}

