package com.example.webvehicles.repository;

import com.example.webvehicles.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findAllByVehicle_Id(Integer id);

}
