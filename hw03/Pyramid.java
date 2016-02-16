// Lindsay Alvarez
// hw03
// 2/16/16
// Given dimensions of a Pyramid, calculated volume of pyramid
// Pyramid java

import java.util.Scanner; // setting up scanner
public class Pyramid {
    // main method
    public static void main (String [ ] args) {
        Scanner myScanner = new Scanner (System.in); 
        
         System.out.print("Enter the square side of the Pyramid (in the form xx: )"); //printing out the command to enter the square side length
        
        System.out.print("Enter the height of the Pyramid (in the form xx: )"); //printing out the command to give java the dimensions of the pyramid so it can calculate the volume
       
        double squareside = myScanner.nextDouble (); // setting up the input for the side
        double height = myScanner.nextDouble (); // setting up the input for the height
        double Volume;
        Volume = ( (squareside*squareside) * (height) / 3); // setting up the formula for pyramid (1/3 * b*h)
        System.out.print (" The volume of the pyramid  is " + Volume); // setting up th eprint result of the pyramid's volume
        
  
   
   
    } // end of main method
    
        
    
} // end of class
