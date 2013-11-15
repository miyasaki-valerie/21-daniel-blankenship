/**************************************************************
- * Authors: Daniel Blankenship  
+ * Author: Daniel Blankenship  
  *************************************************************/
package pkg21;
import java.io.*;
import java.util.Scanner;

import java.io.IOException;

public class TwentyOne implements Serializable{
    private static Scanner inFile = new Scanner(System.in);
    
        public static Scanner getInputFile(){
            return TwentyOne.inFile;
        }

public TwentyOne (){
   
}
    
    public static void main(String[] args) throws IOException{
          
         
        /*
         * GET INITIAL PROMPT
         * asks for the user name, displays it
         *  along with title of game
         */
        GetInitPrompt name = new GetInitPrompt();
        name.getPlayerName();                   // Prompts for player name
        name.display();                         // displays player name
        
        MainMenuView menu = new MainMenuView();
        menu.display();
        menu.getInput();
        


                
        // Creates an instance of MAIN MENU VIEW class
        // MainMenuView MainMenuView = new MainMenuView();
        // MainMenuView.getInput(); // Prompts for menu command
        
        // Demonstrates implementation of ACE SELECT class
        //AceSelect ace = new AceSelect();
        //ace.getInput();

    
      //Displays Help Menu options
     /* HelpMenuView H = new HelpMenuView();
      H.displayHelp();*/
      
      
      // Displays Main Menu options     
      MainMenuView v = new MainMenuView();
      v.display();
      v.getInput();
    
        
        GetCardVal val = new GetCardVal();
        val.display();

    }
}
