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
public class GetInitPrompt implements Serializable {
    
    private String name;
    private String instructions = "\tTHIS IS THE GAME **21**\n\n";
    
    /*
     *  GET INTIAL PROMPT CONSTRUCTOR
     */
    GetInitPrompt()
    {
        
    }
    
    /*
     * GET PLAYER NAME
     */
    public void getPlayerName() {
       Scanner inFile = TwentyOne.getInputFile();
        System.out.println("Please enter your name: ");
        this.name = inFile.next();
    }
    
    /*
     * DISPLAY
     */
    public void display() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
    //
    // GETTERS and SETTERS
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
}
