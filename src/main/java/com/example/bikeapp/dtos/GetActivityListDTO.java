package com.example.bikeapp.dtos;

import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
@ToString
public class GetActivityListDTO {

    private List<GetActivityDTO> postActivitiesValues;

}
