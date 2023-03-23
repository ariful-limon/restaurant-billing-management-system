package com.rbms.food.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Food
 */
@Getter
@Setter
@NoArgsConstructor
@Entity // database table mapping to java class
@Table(name = "food")
// @Builder
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String description;
    private double price;
    private String category;

    public Food(String name, double price, String description, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

}