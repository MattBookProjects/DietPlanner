package com.ofbooks.dietplanner;
import java.awt.Color;

public class App {
    
    private AppGUI gui;
    private IController controller;

    public App(int windowWidth, int windowHeight, LangConst lang, Color bgColor, Color buttonColor, Color activeButtonColor, Color textColor){


        this.gui = new AppGUI(windowWidth, windowHeight, new MenuButtonFactory(lang, new ActionExecutorFactory(this), buttonColor, activeButtonColor, textColor), new ActionConst[]{ActionConst.GENERATE_DIET});

    }

    public void run(){
       
        
    }

    public void generateDiet(){
        System.out.println("Generate diet called");
    }

   

    
}