package com.example.bikeapp.dtos;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class UpdateUserEmailDTO {

    private Long id;
    private String email;
    private String password;

}
