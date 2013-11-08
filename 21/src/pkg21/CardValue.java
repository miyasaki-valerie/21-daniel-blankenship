/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

/**
 * CARD VALUE
 * Creates card values from 2 to Ace
 * 
 * @author Daniel Blankenship
 */
public enum CardValue 
{
    // each of these works like an individual constructor
    //  that constructs the enum at the given value.
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);
  
    private int cardValue;

    // this is a private constructor
    //  sets the value of each cardValue
    private CardValue (int value)
    {
        this.cardValue = value;
    }
  
    // allows outside use of the cardValue value
    public int getCardValue() {
        return cardValue;
    }

}
