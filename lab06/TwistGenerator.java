// Lindsay Alvarez
// lab06
// 3/4/16
// writing a code that prints out a simple "twist"

import java.util.Scanner;
public class TwistGenerator { // start of class
public static void main (String [ ] args) { // start of main method
Scanner input = new Scanner (System.in); // scanner
int length = 0;// setting the integer length to 0 
  System.out.print("Enter the desired length of the twist: "); // asking the user to input a length for the twist 
        while(true) {
        if (input.hasNextInt()) { // while loop for entering the length into the scanner 
            length = input.nextInt();
            if(length<0) { continue;
            }
            break;
        } // end of while loop 
        //if ( length < 0 )// if statement for the user putting in a negative integer
   System.out.println("invalid input, enter again");//if it is a negative input, ask the user to enter another number
   input.next();
        //} // end of if statement
   //else{ // beginning of the else statement that states if the input is positive, continue the loop
    //break;
   //} // end of else statement 
        }
   
  System.out.println("The length of your twist is: " + length); // telling the user what the length of the twist will be 
        int fullTwist = (length / 3); // the formula for a full twist 
        int partofTwist = (length % 3); // the formula for only part of a twist 
 int a = 1; 
        
        while(a <= fullTwist){ // while loop for the int a being a full twist 
        System.out.print("\\ /"); // the symbols for the top line of the twist 
        a++; // adding 1 to int a 
        } // end of while loop 
        
        if(partofTwist == 0){ // if statement that if part of the twist is 0 than only the one symbol will be printed
            System.out.printf("\n"); // the symbol that will be printed from the if statementif the statement is true
            a = 1; 
        } // end of if statement 
        else if(partofTwist == 1){ // beginning of else if statement for part of the twist equaling 1
            System.out.print("\\"); // this will be printed if the input is 1
            System.out.printf("\n"); 
            a = 1;
        }  // end of else if 
        else if (partofTwist == 2){ // if the input is 2 then the following will be printed
            System.out.print("\\ ");
            System.out.printf("\n");
            a = 1;
        } // end of else if
         while(a <= fullTwist){
        System.out.print(" X ");
        a++;
        }
        
        if(partofTwist == 0){
            System.out.printf("\n");
            a = 1;
        }
        else if(partofTwist == 1){
            System.out.print(" ");
            System.out.printf("\n");
            a = 1;
        } 
        else if (partofTwist == 2){
            System.out.print(" X");
            System.out.printf("\n");
            a = 1;
        }
        
        while(a <= fullTwist) {
        System.out.print("/ \\");
        a++;
        }
        
       if(partofTwist == 0){
            System.out.printf("\n");
            a = 1;
        }
        else if(partofTwist == 1){
            System.out.print("/");
            System.out.printf("\n");
            a = 1;
        } 
        else if (partofTwist == 2){
            System.out.print("/ \\");
            System.out.printf("\n");
            a = 1;
        }


} // end of main method
    
} // end of class