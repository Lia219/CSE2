// Lindsay Alvarez 
// hw06
// Fibonacci numbers
// 3/8/16

import java.util.Scanner; // setting up import scanner
public class Fibonacci { // start of class
 
    public static void main(String [] args){ // start of main method 
    Scanner input = new Scanner (System.in); // scanner input set up 
    System.out.println( "Enter the first number in the sequence: ");
    int fib = myScanner.nextint ();
    System.out.println( "Enter the second number in the sequence: ");
    int fib = myScanner.nextint ();
    System.out.println("How many custom Fibonacci numbers should be printed: ");
 
         int fibCount = ; 
         int[] fib = new int[fibCount]; 
         fib[0] = 0;
         fib[1] = 1;
         for(int n=2; n < febCount; n++){ // beginning of for loop and equation for calculating a Fibonacci number 
             fib[n] = fib[n-1] + fib[n-2];
         } // end of for loop 
 
         for(int n=0; n< febCount; n++){ // beginning of second for loop for the amount of numbers in the sequence 
                 System.out.print(("The numbers are: ") fib[n] + " "); // printing out the results 
         } // end of second for loop 
    } // end of main method 
} // end of class 
