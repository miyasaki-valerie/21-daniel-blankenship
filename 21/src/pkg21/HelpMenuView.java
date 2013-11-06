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
    public MainMenuControl c = new MainMenuControl();
    
    //Displays help menu
    public void displayHelp() throws IOException {
        c.displayHelpBorder();
        System.out.println("\tHELP MENU OPTIONS");
        System.out.println("\tEnter I = Game Instructions");
        System.out.println("\tEnter R = Rules and Objective");
        System.out.println("\tEnter T = Strategy Tips");
        System.out.println("\tEnter X = Exit");
        c.displayHelpBorder();
        
        //gets user input
        selection = (char) System.in.read();
        
       do
       {
            ignore = (char) System.in.read();
            
       } while (ignore !='\n');
      
      
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

   
    
   