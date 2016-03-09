// Lindsay Alvarez 
// hw06
// Fibonacci numbers
// 3/8/16

import java.util.Scanner; // import scanner set up
public class Fibonacci{ // start of class
    public static void main(String args[]){ // start of main method
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number in the sequence: "); // telling user to enter the first integer that will be in the fibonacci sequence
        int num1 = myScanner.nextInt(); // setting up scanner for the first number
        System.out.println("Enter the second number in the sequence: "); // telling the user to enter the second integer in the fibonacci
        int num2 = myScanner.nextInt(); // setting up scanner for the second number
        System.out.println("How many custom Fibonacci numbers should be printed?: ");
        int sequenceNum = myScanner.nextInt(); // telling user to enter the amount of fibonacci numbers to put int he sequence
        while( num1 < 0 || num2 < 0 || sequenceNum < 0) { // setting up while loop stating that both numbers must be re entered if not positive
        System.out.println("Integers entered are not valid"); // stating that integers are invalid if not positive
        System.out.println("Please enter the first positive integer again: ");// asking user to re enter first integer if not valid the first time
        num1 = myScanner.nextInt();
        num2 = myScanner.nextInt();
        sequenceNum = myScanner.nextInt();
        } // end of while loop
        int fibNum = ((((sequenceNum) - (num1)) + ((sequenceNum) - (num2))));
        System.out.println("The numbers are: " + fibNum); // final print out of fibonacci sequence
    } // end of main method
} //end of class
        
        
        
        
        
        