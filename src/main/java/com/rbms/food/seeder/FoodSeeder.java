package com.rbms.food.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.rbms.food.model.Food;
import com.rbms.food.repository.FoodRepository;

@Component
public class FoodSeeder implements CommandLineRunner {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public void run(String... args) throws Exception {
        // Food burger = Food.builder().name("American Burger").price(280.0).description("Best Burger in Dhaka")
        //         .category("Fast Food").build();
        // foodRepository.save(burger);

        Food burger = new Food("American Burger", 280.0, "Best Burger in Dhaka", "Fast Food");
        foodRepository.save(burger);
        

    }

}
