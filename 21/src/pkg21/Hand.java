
package pkg21;
import java.io.Serializable;


public class Hand implements Serializable{
   
    int [] playersHand = {10,5,3};
    String [] dealerHand = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String playerCardOne;
    String playerCardTwo;
    String dealerCardOne;
    String dealerCardTwo;
    int max = 2;
    int sum = 0;
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
    
    
    public void addPlayerHand(){
        for(int s : this.playersHand){
          if(s == 10 || s == 5){
              sum += s;
            }
        }
          if(sum == 15){
              System.out.println("Players hand total is: " + sum);
          }
          else{
              System.out.println("Unknown hand total!");
          }
    }
}

