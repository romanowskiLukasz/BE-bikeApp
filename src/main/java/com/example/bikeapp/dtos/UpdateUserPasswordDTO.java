package com.example.bikeapp.dtos;

import lombok.*;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class UpdateUserPasswordDTO {

    private Long id;
    private String oldPassword;
    private String newPassword;

}
