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
public class Chance implements Serializable{
    
    // Variables needed
    int intHand[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    int card;
    boolean isTwentyOne;
    
    /*
     * CALCULATE PROBABILITY
     * calculate the probability of reaching 21 with the given first 
     *  card and some other card from the array
     */
    void chance()
    {
        Scanner inFile = TwentyOne.getInputFile();
        card = inFile.nextInt(); // read in value into card
        
        // if the value entered is out of bounds display error message
        while (card < 2 || card > 14)
        {
            System.out.println(
                    "\tERROR: PLEASE ENTER A VALUE BETWEEN 2 AND 14!!\n");
            card = inFile.nextInt();
        }
        
        // loop through the array
        for (int x:intHand)
        {
            if ((card + x) == 21)
                isTwentyOne = true;
            else
                isTwentyOne = false;
        }
     }
    
    /*
     * DISPLAY
     * display the prompt followed by the function chance
     */
    void display()
    {
        // display the prompt
        System.out.println("\t============================================\n");
        System.out.println("\tPlease enter a value between 2 and 14\n");
        System.out.println("\t============================================\n");
        
        // do the calculation
        chance();

        if (!isTwentyOne) 
        {
            System.out.println("\n\t" + card + " cannot add to 21\n");
        }
        else 
        {
            System.out.println("\n\t" + card + " can add 21\n");
        }
    }
}