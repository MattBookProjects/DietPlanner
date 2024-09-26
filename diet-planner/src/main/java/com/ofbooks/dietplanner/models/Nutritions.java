package com.ofbooks.dietplanner;

public class Nutritions {
    protected double carbs;
    protected double fats;
    protected double proteins;
    protected double calories;

    public Nutritions(double carbs, double proteins, double fats){
        this.carbs = carbs;
        this.proteins = proteins;
        this.fats = fats;
        this.calories = 4 * (carbs + proteins) + 9 * fats;
    }

    public double getCarbs(){
        return this.carbs;
    }

    public double getProteins(){
        return this.proteins;
    }

    public double getFats(){
        return this.fats;
    }

    public double getCalories(){
        return this.calories;
    }

    public Nutritions multiply(double ratio){
        return new Nutritions(
            this.carbs * ratio,
            this.proteins * ratio,
            this.fats * ratio
        );
    }
}