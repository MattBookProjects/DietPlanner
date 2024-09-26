package com.ofbooks.dietplanner;
import java.util.ArrayList;




public class ActionNames {
    private static String[] _snames = new String[]{"Generuj Plan Żywieniowy", "Moje Plany Żywieniowy"};
 
  
    private static ArrayList<String> names;

    public static ArrayList<String> GET_NAMES(){
        if(names == null){
            names = new ArrayList<String>(); 
            for(int i = 0; i < _snames.length; i++ ){
                names.add(_snames[i]);
            }
        }
        return names;
        
    }

    public static String getActionName(ActionConst action, LangConst lang){
        switch(action){
            case GENERATE_DIET:
                switch(lang){
                    case PL:
                        return "Generuj Plan";
                    case EN:
                        return "Generate Diet";
                    default:
                        return "Language not supported";

                }
            case MY_DIETS:
                switch(lang){
                    case PL:
                        return "Moje Plany";
                    case EN:
                        return "My Diets";
                    default:
                        return "Language not supported";
                }
            default:
                return "Name undefined";
        }
    }


}