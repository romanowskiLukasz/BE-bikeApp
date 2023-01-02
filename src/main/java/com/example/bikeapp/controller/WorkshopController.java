package com.example.bikeapp.controller;

import com.example.bikeapp.dtos.*;
import com.example.bikeapp.entities.Bike;
import com.example.bikeapp.entities.BikePart;
import com.example.bikeapp.entities.User;
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

    @GetMapping("/getUserAchievements/{userId}")
    public List<UserAchievementsDTO> getUserAchievements(@PathVariable Long userId) {
        return workshopService.getUserAchievements(userId);
    }

    @PostMapping("/addBike")
    public void addBike(@RequestBody AddBikeDTO bike) {
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
        workshopService.changeBikePartBike(partId, bikeId, partCategory);
    }

    @PutMapping("/updateBike")
    public void updateBike(@RequestBody UpdateBikeDTO updateBikeDTO) {
        workshopService.updateBike(updateBikeDTO);
    }

    @PutMapping("/changeUserEmail")
    public void changeUserEmail(@RequestBody UpdateUserEmailDTO updateUserEmailDTO) {
        workshopService.changeUserEmail(updateUserEmailDTO);
    }

    @PutMapping("/changeUserPassword")
    public void changeUserEmail(@RequestBody UpdateUserPasswordDTO updateUserPasswordDTO) {
        workshopService.changeUserPassword(updateUserPasswordDTO);
    }

    @PostMapping("/user/login")
    public User loginUser(@RequestBody LoginDTO loginModel) {
        return workshopService.loginUser(loginModel);
    }

    @PostMapping("/user/register")
    public void registerUser(@RequestBody RegisterDTO registerDTO) {
         workshopService.registerUser(registerDTO);
    }

    @PostMapping("/updatePartsDistance")
    public void updatePartsDistance(@RequestBody GetActivityListDTO postActivitiesValues) {
        workshopService.updatePartsDistance(postActivitiesValues);
    }

    @PostMapping("/updateBikePartDistance/{partId}/{distance}")
    public void updateBikePartDistance( @PathVariable Long partId, @PathVariable Integer distance) {
        workshopService.updateBikePartDistance(distance,partId);
    }

    public Bike getBikeById(Long id) {
        return null;
    }

    public Bike updateBike(Bike bike) {
        return null;
    }


}

