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

    private int gameSize = 0;
    
    /********************************************
     *  Request Game Size
     *           Allows the user to choose how
     *           many rounds they would like to
     *           play.
     *******************************************/
    void requestGameSize()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n****************************************************\n"
                           + "*   \tHow many rounds would you like to play?\n"
                           + "*****************************************************");
        this.gameSize = input.nextInt();    
    }
    
    /********************************************
     *  Calculate Round
     *           Adds the two dealer cards together
     *           and returns result.
     *           Does the same for the player.
     *******************************************/
    void calcRound()
    {
        ArrayList<Card> randCard = new ArrayList<>();
        Random rand1 = new Random();
        Random rand2 = new Random();
        
        int low1 = 1;
        int high1 = 5;
        int suit = rand1.nextInt(high1-low1) + low1;
        
        int low2 = 1;
        int high2 = 14;
        int rank = rand2.nextInt(high2-low2) + low2;
   
        randCard.add(new Card(rank, suit));
        System.out.println(randCard);
    }
}
