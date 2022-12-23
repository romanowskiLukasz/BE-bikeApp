package com.example.bikeapp.dtos;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDTO {
    private String email;
    private String password;
    private String name;
    private String profileImg;
    private String refreshToken;
}