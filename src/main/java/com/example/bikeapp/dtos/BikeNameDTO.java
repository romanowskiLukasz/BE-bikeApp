package com.example.bikeapp.dtos;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class BikeNameDTO {

    private Long id;
    private String name;

}
