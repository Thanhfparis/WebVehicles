package com.example.webvehicles.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private String email;
    private String phone;
    private String password;
    private LocalDate lastUpdatedDate;

    @OneToMany(mappedBy = "lastUpdatedBy")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<VehicleType> vehicleTypes = new ArrayList<>();

    @OneToMany(mappedBy = "lastUpdatedBy")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Vehicle> vehicles = new ArrayList<>();

    @OneToMany(mappedBy = "lastUpdatedBy")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Reservation> reservations = new ArrayList<>();

    @OneToMany(mappedBy = "lastUpdatedBy")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "lastUpdatedBy")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<User> users = new ArrayList<>();

}
