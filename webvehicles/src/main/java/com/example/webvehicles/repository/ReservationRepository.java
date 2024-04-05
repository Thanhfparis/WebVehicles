package com.example.webvehicles.repository;

import com.example.webvehicles.model.Comment;
import com.example.webvehicles.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findAllByUser_Id(Integer id);
    List<Reservation> findAllByVehicle_Sales_Id(Integer id);
}
