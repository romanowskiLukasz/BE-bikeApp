package com.example.bikeapp.dtos;

import com.example.bikeapp.entities.BikePart;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class BikesDTO {

    private Long id;
    private String brand;
    private String model;
    private String year;
    private String weight;
    private String size;
    private String dateOfPurchase;
    private String img;
    private List<BikePart> bikeParts;

}
