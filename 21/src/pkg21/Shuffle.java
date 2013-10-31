/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

// Allows shuffle class to be used
import java.util.Collections;
// Allows linked list class to be used
import java.util.LinkedList;

/**
 * SHUFFLE
 * Shuffles the contents of the cardVal array
 */
public class Shuffle {
    
  // contains an array of card values  
  private static final String[] cardVal = 
  {"2", "3", "4", "5", "6", "7", "8",
      "9", "10", "Jack", "Queen", "King", "Ace"};

  /*
   * SHUFFLE CARD VALUES
   */
  void shuffleCardsVal()
  {  
     // Add values from cardVal into list1
     LinkedList list = new LinkedList();
     
     // Loops through cardVal array and puts the contents
     //  into a linked list
     for (int i = 0; i < cardVal.length - 1; i++)
     {
         String temp = cardVal[i];
         list.add(temp);
     }
     
     // Shuffle the card values
     Collections.shuffle(list);
     
     // Display the shuffled card values
     System.out.println();
  }
}
