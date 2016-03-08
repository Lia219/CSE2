// Lindsay Alvarez
// hw04
// Decimal to Hexadecimal Converter 
// 2/23/16


import java.util.Scanner;

public class ToHex { // setting up main string
    public static void main (String [ ] args) { // setting up class
    Scanner input = new Scanner (System.in);
    System.out.print("Please enter three numbers representing RGB values (in the form xxx: )"); // format for entering the RGB values to convert them into hexadecimals
    int num =input.nextInt();
    
     int rem; // the remainder being stored as an integer
        
     String str2="";  // storing the result as a hexadecimal
 
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; // hexadecimal number system 
 
     while(num>0) // numbers greater than 0 
     {
       rem=num%16; // formula for converting decimals into hexadecimals
       str2=hex[rem]+str2;  // converting decimal into hexadecimal 
       num=num/16;
     }
     System.out.println("The hexadecimal value is: "+str2); // printing out the hexadecimal value
 
 
        
    } // end of main method
} // end of class
