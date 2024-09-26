package com.ofbooks.dietplanner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;



public class MenuButton extends JButton {
    private IActionExecutor actionExecutor;
    private String text;
    private ActionConst action;
    private Color bgColor;
    private Color activeColor;

    public MenuButton (IActionExecutor actionExecutor, String text, ActionConst action, Color bgColor, Color activeColor, Color textColor){
        this.actionExecutor = actionExecutor;
        this.bgColor = bgColor;
        this.activeColor = activeColor;
        JLabel label = new JLabel();
        label.setText(text);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment (JLabel.CENTER);
        this.setBackground(bgColor);
        this.add(label);
    }

    public IActionExecutor getActionExecutor(){
        return this.actionExecutor;
    }

    public void setActive(){
        this.setBackground(this.activeColor);
    }

    public void setInactive(){
        this.setBackground(this.bgColor);
    }

    public ActionConst getActionConst(){
        return this.action;
    }
}

   