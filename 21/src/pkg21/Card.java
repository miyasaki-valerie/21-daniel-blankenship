/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;

/*
 *
 * @author Valerie Miyasaki
 */
public class Card implements Serializable{
    private int rank;
    private int suit;

    /*
     * CARD CONSTRUCTOR
     */
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    @Override
    public String toString() {
         String Srank = "", Ssuit = "";
        
         switch(rank) {
            case 1:  Srank = "Ace";     break;
            case 2:  Srank = "Two";     break;
            case 3:  Srank = "Three";   break;
            case 4:  Srank = "Four";    break;
            case 5:  Srank = "Five";    break;
            case 6:  Srank = "Six";     break;
            case 7:  Srank = "Seven";   break;
            case 8:  Srank = "Eight";   break;
            case 9:  Srank = "Nine";    break;
            case 10: Srank = "Ten";     break;
            case 11: Srank = "Jack";    break;
            case 12: Srank = "Queen";   break;
            case 13: Srank = "King";    break;
        }
        switch(suit) {
            case 1: Ssuit = "Clubs";    break;
            case 2: Ssuit = "Diamonds"; break;
            case 3: Ssuit = "Hearts";   break;
            case 4: Ssuit = "Spades";   break;
        }
        return Srank + " of " + Ssuit;
    }
}

