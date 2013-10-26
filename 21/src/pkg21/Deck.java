package pkg21;

//import java.io.Serializable;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Valerie Miyasaki
 */
public class Deck {
  
    //an object that is a new array of the Card class 
    private Card[] newDeck;
    int i;
    
    //constructor to build the deck
    public Deck()
    {
        i = 51;
        newDeck = new Card[52];
        int x=0;
        
        //loop through suits, then through ranks and assign to newDeck array
        for (int s=0; s<=3; s++) //loop through suits
        {
            for (int r=0; r<=12; r++) //loop through ranks
            {
                newDeck[x]= new Card(r,s);
                x++;
            }
        }
       
      }
    
        public String getInput() throws IOException
    {
        String gameStatus = InGame.PLAYING;
        
        while (!gameStatus.equals("EXIT"))
        {
            System.out.println("Card Handling: "
                + "\n\n\tInput S to show the entire deck.\n"
                + "\tInput P to pick a card. Any card.\n"
                + "\tInput X to exit to the main Menu"   );
            
            String command = this.getCommand();
            switch (command) {
                case "S":
                    showDeck();
                    break;
                case "P":
                    drawCard();
                    break;
                case "X":
                    MainMenuView main=new MainMenuView();
                    main.getInput();
                    return "EXIT";
            }
        }
        return gameStatus;
    }
    
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
    
 
     private final static String[][] deckOptions = {
        {"S", "Show Me the Deck"},
        {"P", "Pick a Card"},
        {"X", "EXIT"}
    };
    
    

    //prints deck
    
  public void showDeck()
    {   int y;
            for( y=0; y<52; y++){
                System.out.println(newDeck[y]);
            }
    }
 
     
    //picks a single spot from the array and shows the card    
        public void drawCard()
        {   //Card pick;
            Random generator =new Random();
            int randomCard = generator.nextInt(52);
                       
            System.out.println(newDeck[randomCard]);
         
        }

        
        //to print a loop
    /*public static void main(String [] args){
       int x = 0;
       for(int i=0; i<10; i++){
           x += i; 
           System.out.println(x);
       }
}*/
    }



