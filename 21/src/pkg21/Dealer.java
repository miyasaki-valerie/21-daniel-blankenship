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
public class Dealer implements Serializable{
   
    public Dealer(){
    
}
    
    public int drawDealer()
    {
        int temp1, temp2, sum;
        Random rand1 = new Random();
        Random rand2 = new Random();
        temp1 = rand1.nextInt(52);
        temp2 = rand2.nextInt(52);
        
        Card firstCard = Deck.deck.get(temp1);
        Card secondCard = Deck.deck.get(temp2);
        
        // FIRST CARD
        System.out.println("\nDEALER:");
        System.out.println("FIRST CARD:");
        System.out.println("\t" + firstCard.getCardValue() + " of " + 
                                                            firstCard.getSuit());
        
        // SECOND CARD
        System.out.println("SECOND CARD:");
        System.out.println("\t" + secondCard.getCardValue() + " of " +
                                  secondCard.getSuit());
        
        // sets the integer values for each card in the deck for the first card
        int firstCardAmount = 0;
        if (firstCard.getCardValue() == CardValue.TWO)
            firstCardAmount = 2;
        else if (firstCard.getCardValue() == CardValue.THREE)
            firstCardAmount = 3;
        else if (firstCard.getCardValue() == CardValue.FOUR)
            firstCardAmount = 4;
        else if (firstCard.getCardValue() == CardValue.FIVE)
            firstCardAmount = 5;
        else if (firstCard.getCardValue() == CardValue.SIX)
            firstCardAmount = 6;
        else if (firstCard.getCardValue() == CardValue.SEVEN)
            firstCardAmount = 7;
        else if (firstCard.getCardValue() == CardValue.EIGHT)
            firstCardAmount = 8;
        else if (firstCard.getCardValue() == CardValue.NINE)
            firstCardAmount = 9;
        else if (firstCard.getCardValue() == CardValue.TEN)
            firstCardAmount = 10;
        else if (firstCard.getCardValue() == CardValue.JACK)
            firstCardAmount = 10;
        else if (firstCard.getCardValue() == CardValue.QUEEN)
            firstCardAmount = 10;
        else if (firstCard.getCardValue() == CardValue.KING)
            firstCardAmount = 10;
        else if (firstCard.getCardValue() == CardValue.ACE)
            firstCardAmount = 11;
        
        // sets each card in the deck for the second card amount
        int secondCardAmount = 0;
        if (secondCard.getCardValue() == CardValue.TWO)
            secondCardAmount = 2;
        else if (secondCard.getCardValue() == CardValue.THREE)
            secondCardAmount = 3;
        else if (secondCard.getCardValue() == CardValue.FOUR)
            secondCardAmount = 4;
        else if (secondCard.getCardValue() == CardValue.FIVE)
            secondCardAmount = 5;
        else if (secondCard.getCardValue() == CardValue.SIX)
            secondCardAmount = 6;
        else if (secondCard.getCardValue() == CardValue.SEVEN)
            secondCardAmount = 7;
        else if (secondCard.getCardValue() == CardValue.EIGHT)
            secondCardAmount = 8;
        else if (secondCard.getCardValue() == CardValue.NINE)
            secondCardAmount = 9;
        else if (secondCard.getCardValue() == CardValue.TEN)
            secondCardAmount = 10;
        else if (secondCard.getCardValue() == CardValue.JACK)
            secondCardAmount = 10;
        else if (secondCard.getCardValue() == CardValue.QUEEN)
            secondCardAmount = 10;
        else if (secondCard.getCardValue() == CardValue.KING)
            secondCardAmount = 10;
        else if (secondCard.getCardValue() == CardValue.ACE)
            secondCardAmount = 11;
        
        sum = firstCardAmount + secondCardAmount;
        System.out.println(sum);
        
        return sum;
    }
}
