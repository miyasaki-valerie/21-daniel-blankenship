package pkg21;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/*
 *
 * @author Valerie Miyasaki
 */
public class Deck implements Serializable{
  
    private Random shuffle = new Random();
    public ArrayList<Card> fullDeck = new ArrayList<>();
    
    private final static String[][] deckOptions = {
        {"S", "Show Me the Deck"},
        {"P", "Pick a Card"},
        {"X", "EXIT"}
    };
    
    /*
     * DECK CONSTRUCTOR
     */
    public Deck()
    {
        for (int rank = 1; rank <= 13; rank++)
        {
            for (int suit = 1; suit <= 4; suit++)
            {
                fullDeck.add(new Card(rank, suit));
            }
        }    
    }
    
    /*
     * PRINT
     */
    public void print()
    {
        String deckOutput = "";
        
        for (Card card : fullDeck) 
        {
            deckOutput += card.toString() + "\n";
        }
        
        System.out.println(deckOutput);
    }
    
    /*
     * GET INPUT
     */
    public String getInput() throws IOException
    {
        String gameStatus = InGame.PLAYING;
        
        while (!gameStatus.equals("EXIT"))
        {
            System.out.println("\nCard Handling: "
                + "\n\n\tInput S to show the entire deck.\n"
                + "\tInput P to pick a card. Any card.\n"
                + "\tInput X to exit to the main Menu"   );
            
            String command = this.getCommand();
            switch (command) 
            {
                case "S":
                    showDeck();
                    break;
                case "P":
                    drawCard();
                    break;
                case "X":
                    MainMenuView main = new MainMenuView();
                    main.getInput();
                    return "EXIT";
            }
        }
        return gameStatus;
    }
    
    /*
     * GET COMMAND
     */
    protected final String getCommand()
    {
        Scanner inFile = new Scanner(System.in);
        String command = " ";
        boolean valid = false;
        
        while (!valid)
        {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!valid) 
            {
                System.out.println("\tInvalid command. Enter S or P.");
                continue;
            }
        }     
        return command;
    }
    
    /*
     * VALIDATE COMMAND
     */
    private boolean validCommand(String command)
    {
        String[][] items = deckOptions;
        
        for (String[] item : deckOptions)
        {
            if (item[0].equals(command))
            {
                return true;
            }
        }
        return false;
    }
    
    /*
     * NOT a practical function for the actual game,
     * but it could be used.
     */
    public void showDeck()
    {   
        for(int y = 0; y < 52; y++)
        {
            //System.out.println(newDeck[y]);
        }
    }
     
    /*
     * DRAW CARD
     * draws a random card from the deck
     */    
    public void drawCard()
    {   
        //Card pick;
        Random generator = new Random();
        int randomCard = generator.nextInt(52);
                       
        //System.out.println(newDeck[randomCard]);    
    }
}



