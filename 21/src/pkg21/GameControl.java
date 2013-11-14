/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Daniel Blankenship
 */
public class GameControl implements Serializable{
    private final Dealer dealer = new Dealer();
    private final Player player = new Player();
    private int gameSize = 0;
    
    /********************************************
     *  Request Game Size
     *           Allows the user to choose how
     *           many rounds they would like to
     *           play.
     *******************************************/
    void requestGameSize()
    {
        Scanner inFile = TwentyOne.getInputFile();
        System.out.println("\n****************************************************\n"
                           + "*   \tHow many rounds would you like to play?\n"
                           + "*****************************************************");
        this.gameSize = inFile.nextInt();    
    }
    
    /********************************************
     *  Calculate Round
     *   Determines scoring for each round 
     *******************************************/
    void calcRound()
    {
        int playerSum, dealerSum;
        int playerScore = 0; 
        int dealerScore = 0;
        
        for (int i = 0; i < gameSize; i++)
        {
            int temp = i+1;
            System.out.println("\n\t~~~~~~~~~~~~~~");
            System.out.println("\t   ROUND " + temp);
            System.out.println("\t~~~~~~~~~~~~~~");
            
            dealerSum = dealer.drawDealer();
            playerSum = player.drawPlayer();
            
            if (dealerSum == 21)
                dealerScore+=2;
            else if (playerSum == 21)
                playerScore+=2;
            else if ((dealerSum > playerSum) && dealerSum < 21){
                dealerScore++;
            }
            else if ((playerSum > dealerSum) && playerSum < 21){
                playerScore++;
            }
            
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("ROUND TOTALS");
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("DEALER: " + dealerScore);
            System.out.println("PLAYER: " + playerScore);
        }
        
        if (playerScore > dealerScore)
            System.out.println("YOU WIN THE GAME!");
        else if (dealerScore > playerScore)
            System.out.println("SORRY! YOU LOSE");
        else if (dealerScore == playerScore)
            System.out.println("IT'S A TIE!");
    }
}
