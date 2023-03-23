package com.rbms.food.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbms.food.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, UUID>{
    
}
