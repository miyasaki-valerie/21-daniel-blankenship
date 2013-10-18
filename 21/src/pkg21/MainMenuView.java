package pkg21;
import java.io.Serializable;
import java.util.Scanner;

/*
 * MAIN MENU VIEW
 *  Displays the Main Menu options
 * 
 * @author Daniel Blankenship
 */
public class MainMenuView implements Serializable{
    private int userInput;
    
    /*
     * USER INPUT
     * Recieves command to interact with MAIN MENU
     */
    int userInput()
    {
        // continue to loop until user inputs a value
        //  less than 4.
        // Get input from the user
   
        
        do
        {
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter command: ");
            userInput = input.nextInt(); // store input into
                                         //  user input variable
            
            // Display menu if wrong input was entered
            if (userInput > 4)
                display();
            
        } while (userInput > 4); // Continue to loop if the answer if 
                                 //  is wrong.
        return userInput;
    }
    
    /*
     *  DISPLAYS THE MAIN MENU
     *  OPTIONS:
     *      Start Game
     *      Help
     *      Exit
     *      Game Instructions
     */
    void display()
    {
      System.out.println("\n***********************************************\n"
                         + "* MAIN MENU OPTIONS\n"
                         + "* Enter 1 = Start Game\n"
                         + "* Enter 2 = Help\n"
                         + "* Enter 3 = Exit\n"
                         + "* Enter 4 = Instructions\n"
                         + "***********************************************\n");
    }
}
