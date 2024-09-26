package com.ofbooks.dietplanner;

public abstract class Ingridiant {
    protected Nutritions nutritions;
    protected String name;
    protected IngridiantCategoryConst category;

    public Ingridiant(Nutritions nutritions, String name, IngridiantCategoryConst category){
        this.nutritions = nutritions;
        this.name = name;
        this.category = category;
    }

    public Nutritions getNutritions(){
        return this.nutritions;
    }
    
}