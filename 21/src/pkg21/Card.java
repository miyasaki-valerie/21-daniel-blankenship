/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;

/**
 *
 * @author Valerie Miyasaki
 */

public class Card implements Serializable{
    
    private int rank, suit; 
    
    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private String [] ranks = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        
    //returns card ie: 7 of Hearts
    
    @Override
    public String toString(){
        return ranks[rank] + " of " + suits[suit];
    }
    
    //constructor
    
    public Card (int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    //getters and setters
    
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public String[] getSuits() {
        return suits;
    }

    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    public String[] getRanks() {
        return ranks;
    }

    public void setRanks(String[] ranks) {
        this.ranks = ranks;
    }
}
