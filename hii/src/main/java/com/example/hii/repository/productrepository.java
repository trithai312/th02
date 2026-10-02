package com.example.hii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hii.models.product;

public interface productrepository extends JpaRepository<product, Long> {
}