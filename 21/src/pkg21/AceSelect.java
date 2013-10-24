/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;
import java.util.Scanner;

/*
 * ACE SELECT
 * 
 * This class allows the player to select whether 
 *  Aces are High or Low when selected for the round
 */
public class AceSelect implements Serializable {
    
    // Multidimensional String
    private final static String[][] ace = {
        {"H", "Aces High"},
        {"L", "Aces Low"},
        {"X", "EXIT"}
    };
    
    public String getInput()
    {
        String gameStatus = InGame.PLAYING;
        
        while (!gameStatus.equals("EXIT")) 
        {
            this.display();
            
            String command = this.getCommand();
            switch (command) {
                case "H":
                    displayAceHigh();
                    break;
                case "L":
                    displayAceLow();
                    break;
                case "X":
                    return "EXIT";
            }
        }
        return gameStatus;
    }
    
    // GET COMMAND
    //  Checks to see whether the command 
    //   is valid or not
    protected final String getCommand()
    {
        Scanner inFile = new Scanner(System.in);
        String command = " ";  // initialize command 
        boolean valid = false; // initialize boolean to false
        
        // while command is being recieved
        while (!valid) 
        {
            // read in command
            command = inFile.nextLine();
            
            // change command to uppercase to match
            //  request
            command = command.trim().toUpperCase();
            
            // makes a call to validCommand 
            valid = validCommand(command);
            
            // if validation is failed 
            //  print out error message
            if (!valid) 
            {
                System.out.println("\tInvalid command. Enter H or L.");
                continue; 
            }
        } 
        
        return command;
    }
    
    // VALIDATE COMMAND
    // validates whether the command is true or 
    //  false
    private boolean validCommand(String command)
    {
        String[][] items = ace;
        
        for (String[] item : ace)
        {
            if (item[0].equals(command))
            {
                return true;
            }
        }
        
        return false;
    }
    
    // Display: ACES HIGH!
    public void displayAceHigh()
    {
        System.out.println("\n\tACES HIGH!");
    }
    
    // Display: ACES LOW!
    public void displayAceLow()
    {
        System.out.println("\n\tACES LOW!");
    }
    
    // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < ace.length; i++) {
            System.out.println("\t   " + ace[i][0] + "\t" + ace[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    //
    // GETTERS and SETTERS
    //
}
