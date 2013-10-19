
package pkg21;

import java.io.Serializable;


public class SettingsMenuControl implements Serializable {
    
    SettingsMenuView settings = new SettingsMenuView();
    
    int processSettingsCommand(){
        int num;
        num = settings.getSetting();
        
        switch(num){
            case 1:
                System.out.println("We can change deck colors.");
             
            case 2:
                System.out.println("Let's adjust the game sound.");
                
            default:
                settings.displaySettingsMenu();        
        }  
        return num;
    }
}
