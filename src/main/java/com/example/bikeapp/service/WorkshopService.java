package com.example.bikeapp.service;

import com.example.bikeapp.dtos.*;
import com.example.bikeapp.entities.Bike;
import com.example.bikeapp.entities.BikePart;
import com.example.bikeapp.entities.User;
import com.example.bikeapp.repo.ActivityRepo;
import com.example.bikeapp.repo.BikePartRepo;
import com.example.bikeapp.repo.BikeRepo;
import com.example.bikeapp.repo.UserRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class WorkshopService {

    private static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    private final BikePartRepo bikePartRepo;
    private final BikeRepo bikeRepo;
    private final UserRepo userRepo;
    private final ActivityRepo activityRepo;

    public WorkshopService(BikePartRepo bikePartRepo, BikeRepo bikeRepo,UserRepo userRepo,ActivityRepo activityRepo) {
        this.bikePartRepo = bikePartRepo;
        this.bikeRepo = bikeRepo;
        this.userRepo=userRepo;
        this.activityRepo=activityRepo;
    }

    public List<BikesDTO> getAllBikes(Long userId) {

        return bikeRepo.findByUserId(userId).stream().map(bike -> BikesDTO.builder()
                .id(bike.getId())
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

    public void addBike(Bike bike) {
        bikeRepo.save(bike);
    }

    public void deleteBike(Long id) {
        bikeRepo.deleteById(id);
    }

    public void addBikePart(AddBikePartDTO addBikePartDTO) {
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        BikePart bikePart = BikePart.builder()
                .category(addBikePartDTO.getCategory())
                .distance(0)
                .date(simpleDateFormat.format(date))
                .purchaseDate(simpleDateFormat.format(date))
                .bikeType(addBikePartDTO.getBikeType())
                .model(addBikePartDTO.getModel())
                .bikeId(-1L) // -1L means that the part is not used
                .lastDistanceUpdated(date)
                .build();
        bikePartRepo.save(bikePart);
    }


    public void deletePart(Long id) {
        bikePartRepo.deleteById(id);
    }

    public void changeBikePartBike(Long partId, Long bikeId, String category) {
        BikePart oldBikePart = bikePartRepo.findByBikeIdAndCategory(bikeId,category);
        bikePartRepo.deleteById(oldBikePart.getId());
        BikePart newBikePart = bikePartRepo.findById(partId).get();
        newBikePart.setBikeId(bikeId);
        bikePartRepo.save(newBikePart);
    }

    public User loginUser(LoginDTO loginDTO) {
        User user = userRepo.findByEmail(loginDTO.getEmail());
        if (user == null) {
            throw new RuntimeException("No such user");
        }
        if (PASSWORD_ENCODER.matches(loginDTO.getPassword(), user.getPassword())) {
            return user;
        } else {
            throw new RuntimeException("Wrong password");
        }
    }

    public void registerUser(RegisterDTO registerDTO) {
        User user = User.builder()
                .name(registerDTO.getName())
                .email(registerDTO.getEmail())
                .profileImg(registerDTO.getProfileImg())
                .password(PASSWORD_ENCODER.encode(registerDTO.getPassword()))
                .refreshToken(registerDTO.getRefreshToken())
                .build();
        userRepo.save(user);
    }

    public void updatePartsDistance(GetActivityListDTO getActivityDTO) {
        var list=getActivityDTO.getPostActivitiesValues();
        list.stream().forEach(activity ->{
            var arr=activity.getBikeName().split(" ");
            var brand=arr[0];
            var model=arr[1] + " " + arr[2];
            var bike=bikeRepo.findByBrandAndModel(brand,model);
            var bikeParts=bikePartRepo.getBikePartsByBikeId(bike.getId());
            bikeParts.stream().forEach(bikePart -> {
                if(bikePart.getLastDistanceUpdated().before(activity.getDate())){
                    bikePart.setDistance(bikePart.getDistance()+activity.getDistance());
                    bikePart.setLastDistanceUpdated(activity.getDate());
                    bikePartRepo.save(bikePart);
                }
            });
        });
    }

    public void updateBikePartDistance(Integer distance, Long partId) {
        BikePart bikePart = bikePartRepo.findById(partId).get();
        bikePart.setDistance(distance);
        bikePart.setDate(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
                bikePartRepo.save(bikePart);
    }

    public void updateBike(UpdateBikeDTO updateBikeDTO) {
        Bike bike = bikeRepo.findById(updateBikeDTO.getId()).get();
        bike.setBrand(updateBikeDTO.getBrand());
        bike.setModel(updateBikeDTO.getModel());
        bike.setYear(updateBikeDTO.getYear());
        bike.setWeight(updateBikeDTO.getWeight());
        bike.setSize(updateBikeDTO.getSize());
        bike.setImg(updateBikeDTO.getImg());
        bike.setDateOfPurchase(updateBikeDTO.getDateOfPurchase());
        bikeRepo.save(bike);
    }
}
