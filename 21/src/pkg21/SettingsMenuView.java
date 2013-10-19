
package pkg21;

import java.io.Serializable;
import java.util.Scanner;


public class SettingsMenuView implements Serializable {
    
    private int commandS;
    
    int getSetting(){
        
        do{
            
          Scanner inputS = new Scanner(System.in); // store input into
          System.out.println("Enter Command: ");
          commandS = inputS.nextInt(); //  user input variable
         
          if(commandS > 2){
              displaySettingsMenu();
          }
           }while(commandS > 2);
           
            return commandS;
    }
    
    void displaySettingsMenu(){
             
        System.out.println("\n**************************************\n"
                         + "* SETTINGS *\n"
                         + "* 1. Change Deck Color\n"
                         + "* 2. Turn Sound On/Off\n"
                         + "****************************************");    
    }
    }
