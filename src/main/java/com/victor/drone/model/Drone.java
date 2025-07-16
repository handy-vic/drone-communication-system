package com.victor.drone.model;

import jakarta.persistence.*;

@Entity
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identifier;
    private String status;
    private String location;

    // Getters and Setters
}
