package pkg21;
import java.io.Serializable;

/*
 * MAIN MENU CONTROL
 * Incorporates functionality for 
 * the main menu class
 * 
 * @author Daniel Blankenship
 */
public class MainMenuControl implements Serializable {
    
    // Gives access to the input variable
    MainMenuView main = new MainMenuView();
    GameScore game = new GameScore();
    
    /*
     * START GAME
     */
    int processCommand()
    {
        int temp;
        temp = main.userInput();
        
        switch (temp)
        {
            case 1:
                game.requestGameSize();
                game.calcScore();
                break;
            case 2:
                main.display();
                break;
            case 3:
                System.exit(1);
                break;
            case 4:
                showGameRules();
                break;
            default:
                main.display();
        }
        return temp;
    }
    
    /*
     * DISPLAY HELP
     */
    void showGameRules()
    {
        System.out.println("\n***********************************************************************************************\n"
                           + "* Get 21 points on your first two cards (called a blackjack), without a dealer blackjack;\n" +
                             "* Reach a final score higher than the dealer without exceeding 21;\n"
                           + "*    or\n" +
                             "* Let the dealer draw additional cards until his hand exceeds 21.\n"
                           + "***********************************************************************************************\n");  
    }
}
