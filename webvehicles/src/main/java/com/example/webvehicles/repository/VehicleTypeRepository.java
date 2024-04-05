package com.example.webvehicles.repository;

import com.example.webvehicles.model.Vehicle;
import com.example.webvehicles.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
