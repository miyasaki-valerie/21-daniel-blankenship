/**************************************************************
- * Authors: Daniel Blankenship  
+ * Author: Daniel Blankenship  
  *************************************************************/
package pkg21;
import java.io.IOException;
import java.util.*;

public class TwentyOne {
    
    
    public static void main(String[] args) throws IOException {
                
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
        
    }
}
