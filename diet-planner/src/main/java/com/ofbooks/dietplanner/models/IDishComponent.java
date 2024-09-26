package com.ofbooks.dietplanner;

public interface IDishComponent {
    public Nutritions getNutritions();
    public IDishComponent multiply(double ratio);
}