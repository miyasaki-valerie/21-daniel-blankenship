/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Valerie
 */
public class GameView implements Serializable {
    private final Deck deck = new Deck();
    private final GameControl game = new GameControl();
    private final static String[][] menuItems = {
        {"D", "Deal"},
        {"S", "Shuffle"},
        {"X", "Exit Game"}
    };
    
    public String getInput() throws IOException {
        String gameStatus = InGame.PLAYING;
        do {
            this.display();
            
            // get command entered
            String command = this.getCommand();
            switch (command) {
                case "D":
                    game.requestGameSize();
                    game.calcRound();
                    break;
                case "S":
                    deck.shuffleDeck();
                    System.out.println("\n\tDeck has been successfully shuffled!\n");
                    break;
                case "X":
                    return "EXIT";
            }
        } while (!gameStatus.equals("EXIT"));
        return gameStatus;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
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
        String[][] items = menuItems;

        for (String[] item : menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
}
