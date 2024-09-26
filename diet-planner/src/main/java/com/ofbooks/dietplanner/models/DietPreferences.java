package com.ofbooks.dietplanner;
import java.util.List;
import java.util.ArrayList;

public class DietPreferences {
    private CycleDuration cycleDuration;
    private List<DishCategoryPreferences> dishCategoryPreferences;

    public DietPreferences(CycleDuration cycleDuration){
        this.cycleDuration = cycleDuration;
        this.dishCategoryPreferences = new ArrayList<DishCategoryPreferences>();
        
    }
}