/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.*;
/**
 *
 * @author Valerie Miyasaki
 */
public class Card implements Serializable
{
    private Suit suit;              // instance of Suit enum
    private CardValue cardValue;    // instance of CardValue enum
    
    /*
     * CARD CONSTRUCTOR
     * sets the values of cardValue and suit
     */
    public Card (CardValue cardValue, Suit suit)
    {
        this.cardValue = cardValue;
        this.suit = suit;
    }
    
    // returns value of suit
    public Suit getSuit()
    {
        return suit;
    }
    
    // returns value of setSuit
    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }
    
    // returns the value of cardValue
    public CardValue getCardValue()
    {
        return cardValue;
    }
    
    // set the value of cardValue
    public void setVardValue(CardValue cardValue)
    {
        this.cardValue = cardValue;
    }
    
 
    
}

