/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Daniel Blankenship
 */
public class GetCardVal implements Serializable{
    // an array of integer values which will be entered by
    //  the user.
    int val[] = new int[10];
    int a, b, t;
    
    /*
     * DISPLAY
     */
    void display()
    {
        System.out.println("\t=======================================\n");
        System.out.println("\tThis is a simple test program\n");
        System.out.println("\t=======================================\n");
        
        // displays instructions
        System.out.println("\t=======================================\n");
        System.out.println("\tPlease enter list of card values.\n"
                            + "\tCard values must be between 2 and 10.\n");
        System.out.println("\t=======================================\n");

        // fills val[] array with values
        getArrayVal();
        sortArrayVal();
    }
    
    /*
     * GET ARRAY VALUES
     * read in list of numbers into val[] array
     */
    void getArrayVal()
    {
       // declare an instance of Scanner
       Scanner in = new Scanner(System.in);
       int temp; // temporary int only used in this scope
       
       // reads in values into val[] array
       //  until end is reached
       for (int i = 0; i <= val.length - 1; i++)
       {
           // read in int into temporary variable temp
           temp = in.nextInt();
           
           // continues to give error message while temp
           //  is out of range
           while (temp < 2 || temp > 10)
           {
               System.out.println("Please enter a value between 2 and 10\n");
               temp = in.nextInt();
           }
           
           // assign value in temp to val[] array index of i
           val[i] = temp; 
       }
    }
    
    void sortArrayVal()
    {
        // example of bubble sort
        for (a = 1; a < val.length - 1; a++)
            for (b = val.length - 1; b >= a; b--)
            {
                // if out of order
                //  exchange the elements
                if(val[b - 1] > val[b])
                {
                    t = val[b - 1];
                    val[b - 1] = val[b];
                    val[b] = t;
                }
            }
        
        // display sorted array
        System.out.print("Sorted array is: ");
        for (int i = 0; i < val.length - 1; i++)
            System.out.print(" " + val[i]);
        System.out.println();
    }
    
    //
    // GETTERS and SETTERS
    //
    public int[] getVal() {
        return val;
    }

    public void setVal(int[] val) {
        this.val = val;
    }
}
