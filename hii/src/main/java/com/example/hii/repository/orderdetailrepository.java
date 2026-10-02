package com.example.hii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hii.models.orderdetail;

public interface orderdetailrepository extends JpaRepository<orderdetail, Long> {
}