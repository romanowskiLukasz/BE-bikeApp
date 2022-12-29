package com.example.bikeapp.dtos;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class UpdateBikeDTO {

    private Long id;
    private String brand;
    private String model;
    private String year;
    private String weight;
    private String size;
    private String dateOfPurchase;
    private String img;

}
