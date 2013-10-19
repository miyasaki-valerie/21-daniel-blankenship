/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

import java.io.IOException;

/**
 *
 * @author Valerie
 */
public class HelpMenuView {
    char selection, ignore;
    HelpMenuControl helpCommand = new HelpMenuControl();
    //Displays help menu
    public void displayHelp() throws IOException{
            do{
        System.out.println("\n***********************************************\n"
                         + "* HELP MENU OPTIONS\n"
                         + "* Enter I = Game Instructions\n"
                         + "* Enter R = Rules and Objective\n"
                         + "* Enter T = Strategy Tips\n"
                         + "* Enter X = Exit\n"
                         + "***********************************************\n");
       selection = (char) System.in.read();
        
       do{
            ignore = (char) System.in.read();
        } while (ignore !='\n');
        }while (selection != 'I' | selection != 'R' | selection != 'T');  
            helpCommand.processHelp();
    }
    
    public void displayInstructions(){
        System.out.println("Instructions.");
       }
    
    public void displayRules(){
        System.out.println("Rules");
    }
    
    public void displayTips(){
        System.out.println("Tips");
    }
    
    public void exitToMain(){
        MainMenuView showMain = new MainMenuView();
        showMain.display();
        
    }
}

   
    
   
