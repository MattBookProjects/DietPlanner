package com.ofbooks.dietplanner;


public class GenerateDietActionExecutor implements IActionExecutor {
    private App app;

    public GenerateDietActionExecutor(App app){
        this.app = app;
    }

    @Override
    public void execute(){
        this.app.generateDiet();
    }
}