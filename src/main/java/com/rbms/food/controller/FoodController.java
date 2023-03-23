package com.rbms.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbms.food.model.Food;
import com.rbms.food.service.FoodService;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/all")
    public List<Food> getAllEntities() {
        return foodService.getAllEntities();
    }
    
}
