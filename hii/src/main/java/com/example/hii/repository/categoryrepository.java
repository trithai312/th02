package com.example.hii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hii.models.category;

public interface categoryrepository extends JpaRepository<category, Long> {
}
