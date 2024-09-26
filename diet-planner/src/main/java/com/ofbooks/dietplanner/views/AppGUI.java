package com.ofbooks.dietplanner;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;



public class AppGUI extends JFrame implements ActionListener{

    
    private List<MenuButton> menuButtons;
    private JPanel menuPanel;
    private JPanel mainPanel;
   // private Color activeButtonColor;



    public AppGUI(int windowWidth, int windowHeight, MenuButtonFactory menuButtonFactory, ActionConst[] actions){
       // this.activeButtonColor = activeButtonColor;
        this.menuButtons = new ArrayList<MenuButton>();
        this.menuPanel = new JPanel();
        this.mainPanel = new JPanel();
        this.setSize(windowWidth, windowHeight);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Diet Planner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int buttonHeight = windowHeight * 2  / (3 * actions.length + 1);
        int buttonWidth = buttonHeight * 2;
        int xgap = buttonWidth / 3;
        int ygap = buttonHeight / 2;

        for(int i = 0; i < actions.length; i++){
            MenuButton button = menuButtonFactory.create(actions[i]);

            button.setBounds(xgap, i * buttonHeight + (i+1) * ygap, buttonWidth, buttonHeight );
            this.menuButtons.add(button);
            this.menuPanel.add(button);
        }
        this.menuPanel.setBounds(0, 0, 400, 800);
        this.menuPanel.setBackground(Color.red);
        this.mainPanel.setBackground(Color.green);
        this.mainPanel.setBounds(400, 0, 800, 800);
        this.add(menuPanel);
        this.add(mainPanel);
        //this.getContentPane().setBackground(Color.white);
        
        
    }

    public void setActiveAction(ActionConst action){
        for(MenuButton button : this.menuButtons){
            if(button.getActionConst() == action){
                button.setActive();
            }
            else {
                button.setInactive();
            }
        }
    }
  
   

    @Override
    public void actionPerformed(ActionEvent e){
        for(MenuButton button : this.menuButtons){
            if(e.getSource() == button){
                button.getActionExecutor().execute();
            }
        }
        
    }
}
