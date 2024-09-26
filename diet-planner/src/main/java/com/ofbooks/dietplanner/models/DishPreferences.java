package com.ofbooks.dietplanner;

public class DishPreferences {
    private Dish dish;
    private Frequency frequency;
    private int priority;

    public DishPreferences(Dish dish, Frequency frequency, int priority){
        this.dish = dish;
        this.frequency = frequency;
        this.priority = priority;
    }
}