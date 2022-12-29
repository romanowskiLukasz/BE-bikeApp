package com.example.bikeapp.dtos;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
@ToString
public class GetActivityDTO {

    private String bikeName;
    private Integer distance;
    private Date date;

}
