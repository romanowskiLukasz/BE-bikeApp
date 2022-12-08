package com.example.bikeapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "bike")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private String year;

    @Column(name = "weight")
    private String weight;

    @Column(name = "size")
    private String size;

    @Column(name = "dateOfPurchase")
    private String dateOfPurchase;

    @Column(name = "userId")
    private Long userId;

    @Column(name="img")
    private String img;

}
