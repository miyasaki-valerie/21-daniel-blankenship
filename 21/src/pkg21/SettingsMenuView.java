
package pkg21;

import java.io.Serializable;
import java.util.Scanner;


public class SettingsMenuView implements Serializable{
    
    private final static String[][] menuItems = {
        {"C", "Change Deck Color"},
        {"T", "Turn Sound On/Off"}, 
        {"M", "Main Menu"},
        
    };
    
    private SettingsMenuControl SettingsMenuControl = new SettingsMenuControl();
    
    public SettingsMenuView(){
    
}
    public String getInput() {
        
    String gameStatus = InGame.PLAYING;
        do {
            this.displaySettings();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "C":
                    this.SettingsMenuControl.displayDeckColor();
                    break;
                case "T":
                    this.SettingsMenuControl.displaySound();
                    break;
                case "M":
                    this.SettingsMenuControl.exitSettings();
                    break;
            }
        } while (!gameStatus.equals("EXIT"));  
        
         return gameStatus;
    }
    
    public void displaySettings(){
        System.out.println("/t*************************************************");
        for(int i = 0; i < SettingsMenuView.menuItems.length; i++){
          System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("/t*************************************************");
    }
    
    // retrieves the command entered by the end user
    protected final String getCommand() {

        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {

            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!valid) {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = SettingsMenuView.menuItems;

        for (String[] item : SettingsMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    
    
    
}
