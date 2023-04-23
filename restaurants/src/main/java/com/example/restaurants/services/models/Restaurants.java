package com.example.restaurants.services.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurants {
    private String id;
    private String name;
    private String specialization;
}
