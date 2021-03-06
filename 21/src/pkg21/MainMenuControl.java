package pkg21;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author jacksonrkj
 */
public class MainMenuControl implements Serializable  {
    
    public MainMenuControl() {
        
    } 

    public void displayGameStart()
    {
        System.out.println();
        this.displayHelpBorder();
        System.out.println( "\tEXECUTE GAME\n" );
        displayHelpBorder();
    }
    
    public void displayInstructions() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThis is the game 21, also known as Blackjack. "
                + "\n\tEach player draws a card and decides to hit or stay. "
                + "\n\tWhichever player gets the closest to 21 without going"
                + "\n\tover 21 wins the round.");
        displayHelpBorder();
    }
        
    public void displayGameHelp() throws IOException {
        HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.display();
        HelpMenu.getInput();
    }
    
    public void displaySettingsMenu(){
        
    }
                
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
