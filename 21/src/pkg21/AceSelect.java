/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Daniel Blankenship
 */
public class AceSelect implements Serializable {
    
    private final static String[][] ace = {
        {"H", "Aces High"},
        {"L", "Aces Low"},
        {"X", "EXIT"}
    };
    
    AceSelect()
    {
        System.out.println("You got an ace, would you like Aces High "
                + "\n\tor Aces Low?"
                + "\n\n\tInput H for high\n"
                + "\tInput L for low\n");
    }
    
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
    
    protected final String getCommand()
    {
        Scanner inFile = new Scanner(System.in);
        String command = " ";
        boolean valid = false;
        
        while (!valid)
        {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!valid) 
            {
                System.out.println("\tInvalid command. Enter H or L.");
                continue;
            }
        } 
        
        return command;
    }
    
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
