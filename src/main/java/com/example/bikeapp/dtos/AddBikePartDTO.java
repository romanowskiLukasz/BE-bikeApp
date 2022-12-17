package com.example.bikeapp.dtos;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class AddBikePartDTO {

    private String model;
    private String category;
    private String bikeType;

}
