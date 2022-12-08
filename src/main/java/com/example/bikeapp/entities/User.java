package com.example.bikeapp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bikePart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "profileImg")
    private String profileImg;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


}
