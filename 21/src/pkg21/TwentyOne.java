/**************************************************************
 * Authors: Valerie Miyasaki
 *          Daniel Blankenship  
 *************************************************************/
package pkg21;
import java.util.Scanner;

public class TwentyOne {
        
    String name;
    String instructions = "\tTHIS IS THE GAME **21**\n\n";
    
    public static void main(String[] args) {
      TwentyOne to = new TwentyOne();  //access member functions of TwentyOne
      to.getName();                    //get user name    
      to.displayHelp();                //displays name and main title
      
      // Displays Main Menu options     
      MainMenuView v = new MainMenuView();
      v.display();
      v.userInput();
      
      
      MainMenuControl ctrl = new MainMenuControl();
      ctrl.processCommand();
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        this.name = input.next();
    }
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}

