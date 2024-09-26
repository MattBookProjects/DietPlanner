package com.ofbooks.dietplanner;

public class CountableIngridiant extends Ingridiant {
    private double weightPerPiece;

    public CountableIngridiant(Nutritions nutritions, String name, IngridiantCategoryConst category, double weightPerPiece){
        super(nutritions, name, category);
        this.weightPerPiece = weightPerPiece;
    }

    public Nutritions getNutritionsByCount(int count){
        return this.nutritions.multiply(this.weightPerPiece * count / 100);
    }
}