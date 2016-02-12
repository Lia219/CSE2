// Lindsay Alvarez
// hw03
// 2/16/16 
// Converting meters to inches
// User wants to calculate meters into inches 

import java.util.Scanner; //setting up Scanner
public class Convert{
    //main method
    public static void main (String [ ] args){ // setting up main string
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the distance in meters in the form xx.xx:"); // entering the distance 
        double meters = myScanner.nextDouble (); 
        double ConversiontoInches = meters*39.37; // setting up the conversion rate of meters to inches (*39.37)
        System.out.print("Distance in inches " + ConversiontoInches); // Setting up the output information to show the result of converting meters into inches
        
        
        
        
    }// end of main method
}// end of class

