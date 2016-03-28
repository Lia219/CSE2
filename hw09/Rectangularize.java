// Lindsay Alvarez 
// hw09
// Rectangularize.java


import java.util.Scanner;
   public class Rectangularize{
  
  public static void main(String []args){   //create a main method

 Scanner input=new Scanner(System.in);

System.out.print("Enter a word or number: ");   //prompt the user to enter a word or number
 if(input.hasNextInt()){                //if the input is a number go to the method for number
     int num= input.nextInt();
     rectangle(num);
     
 }
 else{
     String word = input.next();    // when the input is word call it string go to method for words
     rectangle(word);
 }

}
public static void rectangle(int num){
    
    int j=1;
    for(int i=1;i<=num;i++){                                                    
        while(j<=num){                                                      
            System.out.print("%");
        j++;
            
        }
    System.out.println();
     j = 1;   
    }
    
    
}

public static void rectangle(String word){                                 
        int num=word.length();                                                  
        for(int i=1;i<=num;i++){
           System.out.println(word);                                        
        }
    }
       
   }