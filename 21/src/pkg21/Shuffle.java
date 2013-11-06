/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

// Allows shuffle class to be used
import java.util.Collections;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * SHUFFLE
 * Shuffles the contents of the cardVal array
 */
public class Shuffle implements Serializable{
    
  // contains an array of card values  
  int cardVal[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    
  /*
   * SHUFFLE CARD VALUES
   */
  void shuffleCardsVal()
  {  
     // Add values from cardVal into list1
     ArrayList list = new ArrayList();
     
     // Loops through cardVal array and puts the contents
     //  into a linked list
     for (int i = 0; i < cardVal.length; i++)
     {
         int temp = cardVal[i];
         list.add(temp);
     }
     
     // Shuffle the card values
     Collections.shuffle(list);
     
     // Display the shuffled card values
     System.out.println(list);
  }
}
