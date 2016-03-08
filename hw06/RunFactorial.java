// Lindsay Alvarez
// hw06
// Run Factorial program
// 3/8/16


import java.util.Scanner; // import scanner set up 

public class RunFactorial{ // beginning of class
    public static void main(String[] args) // beginning of main method
    {
        Scanner myScanner = new Scanner(System.in); //declaring new scanner 
        System.out.println("Please enter an integer that is between 9 and 16"); // ask the user to enter an integer that is between 9 and 16
        int fact = 1, i = 1, n1 = 0;
        for (int n = 0; n<100 ; n++) // continue the loop and ask user again if the user doesnt give the valid input
        { // start of for loop 
        if (myScanner.hasNextInt()) //check the input if it is an integer and continue loop
        { // start of if statement 
            n1 = myScanner.nextInt(); // if it continues n1 will be the integer
            if (n1 <= 9 || n1 >= 16)  // check if integer is between 9 ad 16
            { // start of if statement 
                System.out.println("invalid input, enter again"); //if it is out of the range, ask the user to enter another number
            } // end of if statement
            else 
            { // start of else loop 
                //if in the range, do the following
                while ( i <= n1)  //when i is smaller than the input value, the loop will go on
                { // start of while leep 
                    fact = fact * i; //the factorial value equation
                    i =i+1; //increase the factor by one
                } // end of while loop 
                System.out.println("Input accepted:"); //print out the accepted input
                System.out.println(n1+"! = " + fact); // and the factorial we found
                break; // break to stop loop from continuing forever
            } // end of else loop
        } // end of first if statement
        else
        { // start of second else loop
            System.out.println("invalid input, enter again"); //ask the user to enter another interger
            myScanner.next(); //read the integer
        } // end of second else loop 
        
        } // end of for loop
    } // end of main method
} // end of class