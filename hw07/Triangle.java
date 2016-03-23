//Lindsay Alvarez
//hw07
//3/15/16
// Twisty java 
// Program will take an input between 5 and 30 and create a triangle out of it that has the same amount of rows as the input number

import java.util.Scanner;
public class Triangle { // start of class
                 public static void main(String[] args) { // start of main method
 Scanner myScanner;    // import scanner
myScanner = new Scanner( System.in );
System.out.print("Please enter an integer between 5 and 30: ");   // ask user for a value between 5 an 30
int i =1;
while(i<2){   // run a while loop to so that a correct value is entered
i++;
    if (myScanner.hasNextInt()){  // make sure input is an integer not a letter or negative number 
        int number= myScanner.nextInt();
        if (number>=5 && number<=30){  // if it is an integer and it falls between the accepted range the loop will run
            System.out.println("FOR LOOP:"); 
            for( int Count = 1; Count<=number; Count++ ) { // set up a loop to run the same number of times as the integer entered
                if(Count%2==0){  // test if it is printing an even or odd number
                    for( int Repeat = 1; Repeat<=Count; Repeat++ ) {  //set up a loop to break the line every time it is run when the triangle is finished
                        for( int Stack  = 1; Stack<=Repeat; Stack++ ) {   //Set up a loop to print the number in an rising triangle structure 
                        } 
                    System.out.println(" ");    
                    }    
                } 
                else{ // test if the triangle is printing an even or an odd number
                    for( int Repeat = 1; Repeat<=Count; Repeat++ ) { //set up a loop to break the line every time it is run
                        for( int Stack = Count; Stack>=Repeat; Stack-- ) {   //Set up a loop to print the number in an decreasing triangle structure 
                        } 
                    System.out.println(" ");    
                    }       
                }
            } 
            System.out.println("WHILE LOOP:");
            int Count = 1;
            while(Count<=number  ) {// set up a loop to run the same number of times as the number value
                if(Count%2==0){ // test if the triangle is printing an even or an odd number
                    int Repeat = 1;
                    while(  Repeat<=Count  ) {//set up a loop to break the line every time it is run
                        int Stack = 1;
                        while(  Stack<=Repeat  ) { //Set up a loop to print the number in an increasing triangle structure
                        Stack++;
                        } 
                    System.out.println(" ");
                    Repeat++;
                    }    
                } 
                else{ // test if the current cycle is printing an even or an odd number
                    int Repeat = 1;
                    while(  Repeat<=Count  ) {//set up a loop to break the line every time it is run
                        int Stack = Count;
                        while(  Stack>=Repeat  ) {//Set up a loop to print the number in an decreasing triangle structure strting with it printing the number the same amount of times as its value
                        System.out.print(Count);
                        Stack--;
                        } 
                    System.out.println(" ");   
                    Repeat++;
                    }       
                }
                Count++;
            }
             System.out.println("DO WHILE LOOP:");
             Count = 1;
            do {   // set up a loop to run the number of times as the input value
                if(Count%2==0){ // test if the current cycle is printing an even or an odd number
                    int Repeat = 1;
                   do { //set up a loop to break the line every time it is run
                        int Stack = 1;
                       do {  //Set up a loop to print the number in an increasing triangle structure until it print the number the same amount of times as its value
                        System.out.print(Count);
                        Stack++;
                        }  while(  Stack<=Repeat  );
                    System.out.println(" ");
                        Repeat++;
                    } while(  Repeat<=Count  )  ;  
                } 
                else{ // test if the current cycle is printing an even or an odd number
                    int Repeat = 1;
                    do { //set up a loop to break the line every time it is run
                        int Stack = Count;
                        do { //Set up a loop to print the number in an decreasing triangle structure strting with it printing the number the same amount of times as its value
                        System.out.print(Count); 
                        Stack--;
                        } while(  Stack>Repeat  );
                    System.out.println(" ");   
                    Repeat++;
                    }while(  Repeat<=Count  ) ; // set up a loop to run the number of times as the number value
                }
                Count++;
            }while(Count<=number  );
        }
        else{ // else loop for entering a number that is not betweeen 5 and 30
            System.out.println("Pleases enter an integer between 5 and 30, Please try again"); // print out asking for integer that is positive and between 5 and 30
            i--;
        }
    }
    else{
            System.out.println("Please enter an integer between 5 and 30, Please try again"); // final print out asking for integer if first integer was not positive or between 5 an 30
               i--;
               myScanner.next();
        }
} // end of class
}} // end of main method
 