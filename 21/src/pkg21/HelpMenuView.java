/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Valerie Lesson 4
 */

public class HelpMenuView implements Serializable{
    
    public HelpMenuControl HelpMenuControl = new HelpMenuControl();
    public MainMenuView main = new MainMenuView();
    
 private final static String[][] helpMenuItems = {
        {"I", "Show Instructions"},
        {"X", "Exit Menu"}
    };
                
    public String getInput() throws IOException {
        
        String gameStatus = InGame.PLAYING;
        
        while (!gameStatus.equals("EXIT")){
            String command = this.getCommand();
            switch (command) {
                case "I":
                    HelpMenuControl.displayInstructions();
                    break;
                case "X":
                    main.display();
                    main.getInput();
                    return "EXIT";
            }
        }
        
        return gameStatus;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.helpMenuItems.length; i++) {
            System.out.println("\t   " + helpMenuItems[i][0] + "\t" + helpMenuItems[i][1]);
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
    
      private boolean validCommand(String command) {
        String[][] items = HelpMenuView.helpMenuItems;

        for (String[] item : HelpMenuView.helpMenuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}
    
   
