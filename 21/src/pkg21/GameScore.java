
package pkg21;

import java.io.Serializable;
import java.util.Scanner;

/***********************************************************
 * GAME SCORE CLASS
 * Receives and calculates the game score
 **********************************************************/
public class GameScore implements Serializable {
    
    //
    // PRIVATE VARIABLES
    //
    private int playerScore;
    private int dealerScore;
    private int playerCard1;
    private int playerCard2;
    private int dealerCard1;
    private int dealerCard2;
    private int gameSize;
    private int wins;
    private int losses;
    
    /***********************************************************
     * CONSTRUCTOR
     * Creates instance of GAME SCORE class
     **********************************************************/
    public GameScore() {
        playerScore = 0;
        dealerScore = 0;
        playerCard1 = 0;
        playerCard2 = 0;
        dealerCard1 = 0;
        dealerCard2 = 0;
        gameSize = 0;
        wins = 0;
        losses = 0;
    }
    
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
                         + "*\tHow many rounds would you like to play?\n"
                         + "*****************************************************");
        this.gameSize = input.nextInt();    
    }
    
    /***********************************************************
     * INPUT PLAYER SCORE
     * input the player and dealers scores
     **********************************************************/
    void calcScore(){
        
        for (int i = 0; i < gameSize; i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("PLAYER - Card 1: ");
            this.playerCard1 = input.nextInt();
        
            Scanner input1 = new Scanner(System.in);
            System.out.println("PLAYER - Card 2: ");
            this.playerCard2 = input.nextInt();
        
            Scanner input2 = new Scanner(System.in);
            System.out.println("DEALER - Card 1: ");
            this.dealerCard1 = input.nextInt();
        
            Scanner input3 = new Scanner(System.in);
            System.out.println("DEALER - Card 2: ");
            this.dealerCard2 = input.nextInt();
            System.out.println("\n");
            
            calcRound();
            displayScore();
            displayWinner();
          }
     }
    
    /***********************************************************
     * CALCULATE SCORE
     * Adds cards together and assigns the sum TOTAL variable
     **********************************************************/
    void calcRound()
    {
        double playerTotal;
        playerTotal = playerCard1 + playerCard2;
        
        double dealerTotal;
        dealerTotal = dealerCard1 + dealerCard2;
        
        if ((playerTotal > dealerTotal) && playerTotal < 21)
            playerScore++;
        
        if ((dealerTotal > playerTotal) && dealerTotal < 21)
            dealerScore++;        
    }
    
    /***********************************************************
     * DISPLAY SCORE
     * Displays the scores for PLAYER and DEALER
     **********************************************************/
    void displayScore(){      
        
        System.out.println("\tPlayer score is: \n" + playerScore);
        System.out.println("\tDealer score is: \n" + dealerScore);
        
        if (dealerScore > playerScore)
        {
            System.out.println(
              "\nDealer score is: " + dealerScore + ". Sorry. You lose this round.\n");
        }
        else 
        {
            System.out.println("\nYou win this round\n");
        }
    }
    
    /***********************************************************
     * DISPLAY WINNER
     * Displays who wins
     **********************************************************/
    void displayWinner(){
     
    }

    //
    // GETTERS and SETTERS
    //
    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getDealerScore() {
        return dealerScore;
    }

    public void setDealerScore(int dealerScore) {
        this.dealerScore = dealerScore;
    }

    public int getPlayerCard1() {
        return playerCard1;
    }

    public void setPlayerCard1(int playerCard1) {
        this.playerCard1 = playerCard1;
    }

    public int getPlayerCard2() {
        return playerCard2;
    }

    public void setPlayerCard2(int playerCard2) {
        this.playerCard2 = playerCard2;
    }

    public int getDealerCard1() {
        return dealerCard1;
    }

    public void setDealerCard1(int dealerCard1) {
        this.dealerCard1 = dealerCard1;
    }

    public int getDealerCard2() {
        return dealerCard2;
    }

    public void setDealerCard2(int dealerCard2) {
        this.dealerCard2 = dealerCard2;
    }

    public int getGameSize() {
        return gameSize;
    }

    public void setGameSize(int gameSize) {
        this.gameSize = gameSize;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
    
}