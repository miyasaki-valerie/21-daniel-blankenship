/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author Daniel Blankenship
 */
public class Deck implements Serializable{
    double[] myCardDeck = new double[52]; 
    
    Random random = new Random();
    
    void displayDeck()
    {
        for (int i = 0; i < 52; i++)
        {
            myCardDeck[i] = random.nextInt(52);        
        }
        
        for (int i = 0; i < 52; i++)
        {
            System.out.println(i + " ");
            System.out.println(myCardDeck[i]);
            System.out.println("\n");
        }
        
    }
    
    
}
