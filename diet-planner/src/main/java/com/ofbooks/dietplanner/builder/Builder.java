package com.ofbooks.dietplanner;

import java.awt.Color;



public class Builder{
    private LangConst lang;
    private int windowWidth;
    private int windowHeight;
    private Color bgColor;
    private Color buttonColor;
    private Color activeButtonColor;
    private Color textColor;

    public Builder(){
        this.lang = LangConst.EN;
        this.windowWidth = 1200;
        this.windowHeight = 800;
        this.bgColor = Color.white;
        this.buttonColor = Color.green;
        this.textColor = Color.white;
        this.activeButtonColor = Color.yellow;
    }

    public void setLang(LangConst lang){
        this.lang = lang;
    }

    public void setWindowHeight(int windowHeight){
        this.windowHeight = windowHeight;
    }

    public void setWindowWidth(int windowWidth){
        this.windowWidth = windowWidth;
    }

    public void setBgColor(Color color){
        this.bgColor = color;
    }

    public void setButtonColor(Color color){
        this.buttonColor = color;
    }

    public void setActiveButtonColor(Color color){
        this.activeButtonColor = color;
    }

    public void setTextColor(Color color){
        this.textColor = color;
    }

    public App build(){
        return new App(this.windowWidth, this.windowHeight, this.lang, this.bgColor, this.buttonColor, this.activeButtonColor, this.textColor);
    }

}