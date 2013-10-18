/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

/**
 *
 * @author Valerie
 */
public class HelpMenuControl {
    HelpMenuView helpMenu = new HelpMenuView();
    
    public void processCommand(){
        
        switch(helpMenu.selection) {
            
            case 'I':
                helpMenu.displayInstructions();
                break;
                
            case 'R':
                helpMenu.displayRules();
                break;
                
            case 'T':
                helpMenu.displayTips();
                
            case 'X':
                helpMenu.exitToMain();
                break;
            
        }
    }
    
}
