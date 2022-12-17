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
public class BikePart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "category")
    private String category;

    @Column(name = "distance")
    private int distance;

    //when was added to the bike
    @Column(name = "date")
    private String date;

    @Column(name = "purchaseDate")
    private String purchaseDate;

    @Column(name = "bikeType")
    private String bikeType;

    @Column(name = "model")
    private String model;

    @Column(name = "bikeId")
    private Long bikeId;

}
