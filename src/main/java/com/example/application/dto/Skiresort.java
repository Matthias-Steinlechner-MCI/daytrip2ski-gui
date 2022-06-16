package com.example.application.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skiresort {
    private Long id;
    private String name;

    private Long latitude;
    private Long longitude;
    private Long altitudeValley;
    private Long altitudeMountain;

    private Long numberOfCogRailway;
    private Long numberOfFunicular;
    private Long numberOfCableCar;
    private Long numberOfGondolaLift;
    private Long numberOfChairLift;
    private Long numberOfTBarLift;
    private Long numberOfBabyLift;
    private Long numberOfMovingCarpet;

    private Long distanceEasy;
    private Long distanceIntermediate;
    private Long distanceDifficult;

    private String generalSnowCondition;
    private Long numberOfRestaurants;

    private String webcamUrl;
    private String websiteUrl;

    private Boolean skiRental;
    private Boolean skiCourse;

    private Boolean familyFriendly;

    private Double priceDayTicketAdults;
    private Double priceDayTicketYouth;
    private Double priceDayTicketChildren;

    private LocalDate seasonFrom;
    private LocalDate seasonTo;

    private LocalTime openingHoursFrom;
    private LocalTime openingHoursTo;
    private String openingHoursNote;

    private String remark;
    private String description;

    private Boolean isActive;
}