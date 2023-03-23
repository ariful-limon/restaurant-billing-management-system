package com.rbms.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbms.food.model.Food;
import com.rbms.food.repository.FoodRepository;

@Service
public class FoodService {
    
    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllEntities() {
        return foodRepository.findAll();
    }
}
