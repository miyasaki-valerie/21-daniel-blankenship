/**************************************************************
 * Author: Daniel Blankenship  
 *************************************************************/
package pkg21;
public class TwentyOne {
    
    public static void main(String[] args) {
        // Creates an instance of GET INITIAL PROMPT class
        GetInitPrompt name = new GetInitPrompt();
        name.getPlayerName(); // Prompts for player name
        name.display(); // displays player name
        
        // Creates an instance of MAIN MENU VIEW class
        // MainMenuView MainMenuView = new MainMenuView();
        // MainMenuView.getInput(); // Prompts for menu command
        
        // Demonstrates implementation of ACE SELECT class
        //AceSelect ace = new AceSelect();
        //ace.getInput();
      
        // Demonstrates a simple test program that shuffles an array
        //Shuffle s = new Shuffle();
        //s.shuffleCardsVal();
        
        GetCardVal val = new GetCardVal();
        val.display();
    }
}

