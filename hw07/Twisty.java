// Lindsay Alvarez
// hw07
// part 1
// Write a program that asks the user for two integers: Length and Width. Length is characters across the scren horizontally. Width is characters across the screen vetically
// while for and do while loops 

import java.util.Scanner; // import scanner 
public class Twisty { // start of main class
public static void main(String [] args) { // start of main method 
Scanner myScanner; // create myScanner 
myScanner = new Scanner(System.in); 
System.out.print( "Imput your desired length: ");
int length = 0;
int width = 0;
System.out.print("Enter the desired length of the twist: "); // asking the user to input a length for the twist 
        while(true) {
        if ( myScanner.next()); { // while loop for entering the length into the scanner 
            length =  myScanner.next();
            if(length<0) { continue; // if the length is negative invalid input
            }
            break;
        } // end of while loop 
        //if ( length < 0 )// if statement for the user putting in a negative integer
   System.out.println("invalid input, enter again");//if it is a negative input, ask the user to enter another number
   input.next();
   System.out.print("Enter the desired width of the twist: "); // asking the user to input a width for the twist 
        while(true) {
        if ( myScanner.next()); { // while loop for entering the width into the scanner 
            width =  myScanner.next();
            if(width<0) { continue; // if width is negative, invalid input
            }
            break;
        }
        }// end of while loop 
        //if ( length < 0 )// if statement for the user putting in a negative integer
   System.out.println("invalid input, enter again");//if it is a negative input, ask the user to enter another number
   input.next();
   
  while (true){
      if( myScanner.next()) {
          width =   myScanner.next();
          if (width > length) { continue;
          }
          break;
      }
      System.out.println("Width is larger than length, invalid input, enter again"); // if width is greater than length the user will be asked to enter a new number
      }// end of while
      
      
      
      
      int fullTwist = (length / 3); // the formula for a full twist 
        int partofTwist = (length % 3); // the formula for only part of a twist 
 int a = 1; 
        
        while(a <= fullTwist){ // while loop for the int a being a full twist 
        System.out.print("\\"); // the symbols for the top line of the twist 
        a++; // adding 1 to int a 
        } // end of while loop 
        
        if(partofTwist == 0){ // if statement that if part of the twist is 0 than only the one symbol will be printed
            System.out.printf("\n"); // the symbol that will be printed from the if statement if the statement is true
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
        System.out.print(" # ");
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
            System.out.print(" #");
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
        break;
        }

  
    
}
}// end of main method

} // end of main class