package com.example.bikeapp.dtos;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class UserAchievementsDTO {

    private String name;
    private String category;
    private String img;
    private Boolean isCompleted;

}
