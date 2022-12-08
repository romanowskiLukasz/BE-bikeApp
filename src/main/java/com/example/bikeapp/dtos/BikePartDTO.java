package com.example.bikeapp.dtos;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class BikePartDTO {

    private Long id;
    private String category;
    private String distance;
    private String date;
    private String purchaseDate;
    private String bikeType;
    private String model;

}
