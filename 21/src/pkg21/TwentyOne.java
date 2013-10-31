/**************************************************************
- * Authors: Daniel Blankenship  
+ * Author: Daniel Blankenship  
  *************************************************************/
package pkg21;
import java.io.IOException;

public class TwentyOne {
   
   
    
    public static void main(String[] args) throws IOException {
                
        // Creates an instance of GET INITIAL PROMPT class
        GetInitPrompt name = new GetInitPrompt();
        name.getPlayerName(); // Prompts for player name
        name.display(); // displays player name
        
        Deck fullDeck = new Deck();
        fullDeck.getInput();
       // fullDeck.showDeck();
        //fullDeck.drawCard();
        
                
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
