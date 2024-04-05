package com.example.webvehicles.repository;

import com.example.webvehicles.model.Admin;
import com.example.webvehicles.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByEmailAndPassword(String email, String password);
}
