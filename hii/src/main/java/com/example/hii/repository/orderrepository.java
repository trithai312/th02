package com.example.hii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hii.models.order;

public interface orderrepository extends JpaRepository<order, Long> {
}