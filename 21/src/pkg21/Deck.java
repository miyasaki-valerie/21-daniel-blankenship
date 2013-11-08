package pkg21;

import java.util.*;

/*
 * DECK
 * Creates a deck of cards
 * 
 * @author Valerie Miyasaki
 */
public class Deck 
{
    // declares an ArrayList of type Card from the Card class
    private ArrayList<Card> deck;
    
    /*
     * DECK CONSTRUCTOR
     * 
     */
    public Deck()
    {
        // initialize instance of ArrayList
        this.deck = new ArrayList<Card>();
        for (int i=0; i<13; i++)            // loop runs til i reaches 13
        {                                   //  allows values of CardValue class 
                                            //  to be created
            
            // creates an instance of CardValue class to read values into
            CardValue value = CardValue.values()[i];
            
            // loop runs til i reaches 4
            //  attaches a suit to each set of CardValues
            for (int j=0; j<4; j++)
            {
                // creates an instance of the Card class
                                // CardValue    Suit 
                Card card = new Card(value, Suit.values()[j]);
                this.deck.add(card);    // adds values into card ArrayList
            }
        }
        this.shuffleDeck();
    }
    
    /*
     * SHUFFLE DECK
     * shuffles the deck
     */
    final void shuffleDeck()
    {
        // shuffle the arrayList
        Collections.shuffle(deck);
    }
    
    public int dealer()
    {
        int temp1, temp2, sum;
        Random rand1 = new Random();
        Random rand2 = new Random();
        temp1 = rand1.nextInt(52);
        temp2 = rand2.nextInt(52);
        
        Card firstCard = deck.get(temp1);
        Card secondCard = deck.get(temp2);
        
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
    
   /*
    * PLAYER
    * deals the player a card from a shuffled deck
    */
    public int player()
    {
        String command;                // these are temporary variables only to 
        int temp1, temp2, sum;  //  only to be used in this function
        
        // allows the user to be able input response 'Y' || 'N'
        Scanner inFile = new Scanner(System.in);
        Random rand1 = new Random();    // rand1 to recieve rand int for card1
        Random rand2 = new Random();    // rand2 to recieve rand int for card2
        Random rand3 = new Random();
        temp1 = rand1.nextInt(52);      // store rand1 int into temp1
        temp2 = rand2.nextInt(52);      // store rand2 int into temp2
        
        Card firstCard = deck.get(temp1);   // retrieve card from arrayList
                                            //  to store into firstCard
        Card secondCard = deck.get(temp2);  // retrieve card from arrayList
                                            //  to store into secondCard
        
        // display for firstCard
        System.out.println("\nPLAYER:");
        System.out.println("FIRST CARD:");
        System.out.println("\t" + firstCard.getCardValue() + " of " + 
                                                            firstCard.getSuit());
        
        // prompt for hit or stay
        System.out.println("Would you like to Hit? Please enter 'Y' or 'N': ");
        command = inFile.nextLine();    // retrieves repsonse
        command = command.trim().toUpperCase(); // converts response to upper
                                                //  case
        
        // Does the player want to hit or stay?
        if ("Y".equals(command)||"N".equals(command)) 
        {
            switch (command) {
                case "Y":
                    secondCard = deck.get(temp2);
                    System.out.println("\nSECOND CARD:");
                    System.out.println("\t" + secondCard.getCardValue() + " of " +
                            secondCard.getSuit());
                    break;
                case "N":
                    System.out.println("\tThanks for playing!\n");
                    return 0;
            }
        } 
        else
            System.out.println("Invalid command. Please enter 'Y' or 'N'");
        
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
        
        // return card total
        return sum;
    }    
}



