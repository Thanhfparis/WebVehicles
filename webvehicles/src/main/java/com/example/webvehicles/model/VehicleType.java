package com.example.webvehicles.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "VehicleType")
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private LocalDate lastUpdatedDate;

    @ManyToOne
    @JoinColumn(name = "last_updated_by")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Admin lastUpdatedBy;

    @OneToMany(mappedBy = "vehicleType")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Vehicle> vehicles = new ArrayList<>();

}
