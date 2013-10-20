package pkg21;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;


public class MainMenuView implements Serializable  {
        
   
    private final static String[][] menuItems = {
        {"S", "Start Game"},
        {"I", "Instructions"}, 
        {"H", "Help"},
        {"X", "Exit Game"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private MainMenuControl MainMenuControl = new MainMenuControl();
    private GameScore GameScore = new GameScore();
    
    // default constructor
    public MainMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() throws IOException {       
        
        String gameStatus = InGame.PLAYING;
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "S":
                    this.MainMenuControl.displayGameStart();
                    break;
                case "I":
                    this.MainMenuControl.displayInstructions();
                    break;
                case "H":
                    this.MainMenuControl.displayGameHelp();
                    break;                  
                case "X":
                    return "EXIT";
            }
        } while (!gameStatus.equals("EXIT"));  
        
         return gameStatus;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
    
    // retrieves the command entered by the end user
    protected final String getCommand() {

        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {

            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!valid) {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
     
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}