
package pkg21;



public class SettingsMenuControl{    
    
    public SettingsMenuControl(){
        
    }
    
    public void displayDeckColor(){
        System.out.println("You Just Channged Your Deck Color.");
       }
    
    public void displaySound(){
        System.out.println("Let's Adjust The Sound.");
    }

    public void exitSettings() {
          MainMenuView mainM = new MainMenuView();
          mainM.display();
    }
        
       
           
                
   }  
        
    

