package com.example.webvehicles.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Data
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String role;

    @OneToMany(mappedBy = "user")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Comment> comments = new ArrayList<>();

    private LocalDate lastUpdatedDate;

    @ManyToOne
    @JoinColumn(name = "last_updated_by")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Admin lastUpdatedBy;

    @OneToMany(mappedBy = "sales")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Vehicle> vehicles = new ArrayList<>();

}
