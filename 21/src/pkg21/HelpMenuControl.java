/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

import java.io.Serializable;

/**
 *
 * @author Valerie Lesson 4
 */
public class HelpMenuControl implements Serializable  {
    

    public HelpMenuControl(){

        
        } 

        public void displayInstructions() {
            System.out.println();
            System.out.println( 
                "\tThis is the game 21, also known as Blackjack. "
                + "\n\tEach player is dealt two cards. Then has the"
                + "\n\topportunity to hit or stay."
                + "\n\tWhichever player gets the closest to 21 without"
                + "\n\tgoing over 21 wins the round.");
        }

} 
    

