
package pkg21;
import java.io.Serializable;


public class Hand implements Serializable{
   
    String [] playersHand = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String [] dealerHand = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String playerCardOne;
    String playerCardTwo;
    String dealerCardOne;
    String dealerCardTwo;
    int max = 2;
    public Hand(){
        
    }
    
    public void displayHands(){
       for(int c = 0; c < max; c++){
         System.out.println(playersHand[c]);
         System.out.println(dealerHand[c]);
       }
        }
        
    public void getPlayerHand(){
        
    }
        
    public void getDealerHand(){
        
    }
}
