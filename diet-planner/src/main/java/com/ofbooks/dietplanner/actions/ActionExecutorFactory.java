package com.ofbooks.dietplanner;

public class ActionExecutorFactory {
    private App app;

    public ActionExecutorFactory(App app){
        this.app = app;
    }

    public IActionExecutor create(ActionConst action){
        switch(action){
            case GENERATE_DIET:
                return new GenerateDietActionExecutor(app);
            default:
                return null;
        }
    }
}