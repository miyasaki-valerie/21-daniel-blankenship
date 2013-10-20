/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

import java.io.IOException;

/**
 *
 * @author Valerie Lesson 4
 */
public class HelpMenuView {
    public char selection, ignore;
    public HelpMenuControl helpCommands = new HelpMenuControl();
    
    //Displays help menu
    public void displayHelp() throws IOException {
      { System.out.println("HELP MENU OPTIONS");
        System.out.println("Enter I = Game Instructions");
        System.out.println("Enter R = Rules and Objective");
        System.out.println("Enter T = Strategy Tips");
        System.out.println("Enter X = Exit");
       
        //gets user input
        selection = (char) System.in.read();
        
       do{
            ignore = (char) System.in.read();
        } while (ignore !='\n');
             }
      
      //processes input for menu item selection using HelpMenu Control Object
      switch(selection) {
            
            case 'I':
                helpCommands.displayInstructions();
                break;
                
            case 'R':
                helpCommands.displayRules();
                break;
                
            case 'T':
                helpCommands.displayTips();
                
            case 'X':
                helpCommands.exitToMain();
                break;
            
        }
    }
   
  
}

   
    
   