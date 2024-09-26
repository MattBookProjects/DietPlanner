package com.ofbooks.dietplanner;
import java.awt.Color;


public class MenuButtonFactory{
    private LangConst lang;
    private ActionExecutorFactory actionExecutorFactory;
    private Color buttonColor;
    private Color textColor;
    private Color activeButtonColor;

    public MenuButtonFactory(LangConst lang, ActionExecutorFactory actionExecutorFactory, Color buttonColor, Color activeButtonColor, Color textColor){
        this.lang = lang;
        this.actionExecutorFactory = actionExecutorFactory;
        this.buttonColor = buttonColor;
        this.activeButtonColor = activeButtonColor;
        this.textColor = textColor;

    }

    public MenuButton create(ActionConst action){
        String text = ActionNames.getActionName(action, this.lang);
        IActionExecutor actionExecutor = this.actionExecutorFactory.create(action);
        return new MenuButton(actionExecutor, text, action, this.buttonColor, this.activeButtonColor, this.textColor);
    }
}