// Lindsay Alvarez
// hw11
// Exploring Search in java


import java.util.Scanner; // import scanner

public class CSE2Linear{ // define class
    

public static void main(String [] args){ // main method
        
        Scanner myScanner=new Scanner (System.in);
        boolean flag = false;
        int numList[] = new int[15]; // telling user to enter 15 integers
        System.out.print("Enter 15 ints for grades(0-100) in numeric order"); 
        for (int i=0; i<15; i++){ 
            numList[i] = -1;
        }
        int counter = 0; 
        
        int response = -1;
        while (counter<15){  // if the user doesn't enter 15 tell user to enter 15
            if(!myScanner.hasNext()){
                System.out.println("You did not enter 15. Please enter 15 ints"); 
                System.exit(1);
            }
            if (!myScanner.hasNextInt()){ // telling user to re enter because what they entered is not an integer
                System.out.println("What you entered is not an int. Please enter an int" + counter);
                System.exit(1);
            }
            response = Integer.parseInt(myScanner.next()); // telling user to reenter if the ints are not in the range (0-100)
            if ((response>100) || (response<0) ){
                System.out.println("What you entered was not in the range of 0-100. Please enter another int in that range" + counter);
                System.exit(1);
            }
            if (counter == 0){
                numList[0] = response;
                counter++;
            }
            else{
                if (response < numList[counter-1]){
                    System.out.println("Less than last. Please enter another int" + counter); // if the int was less than the last reenter
                    System.exit(1);
                }
                else{
                    numList[counter]=response;
                    counter++;
                }
            }
        }
        String gradeS="[";
        for (int i=0; i<15; i++){
            gradeS+=" "+numList[i];
        }
        System.out.println(gradeS+" ]");
        System.out.println("Enter a number to search for"); // asking user to enter a number for the search to look for 
        int find = myScanner.nextInt();
        binary(numList,find);
        scramble(numList);
        System.out.println("Enter another number to search for"); // asking the user again to enter a number to search for
        int find2=myScanner.nextInt();
        linear(numList,find2);
        
}
public static void linear(int []arr,int find){ // Linear method
    boolean found=false;
    int it=0;
    for(int i=0; i<15&&!found; i++){
        if(arr[i]==find){
           found=true;
           it=i;
        } 
    }
    if (found == true){ // if the number entered is true then give the number
            System.out.println(find+" was found in " + it + " iterations");
        }
        else
           System.out.println("Number not found. Please try another number"); // if not true enter another number
    
}
public static void scramble(int []arr){ // method scramble 
    for(int i=0; i<15; i++){
        int rand=(int)(Math.random()*15);
        int temp=arr[i];
        arr[i]=arr[rand];
        arr[rand]=temp;
    }
    String s="[";
    for(int i=0; i<15; i++){
        s+=" "+arr[i];
    }
    System.out.println(s+" ]");
} 

public static void binary(int []arr,int find){ // method binary 
    int start = 0;
    int end = arr.length-1;
    int index = (end+start)/2;
    boolean found = false;
    int i = 0;
    while(start<=end){
        if(find>arr[index]){
            start = index+1;
        }
        else if(arr[index]==find){
            start=end+1;
            found=true;
        }
        else {
            end=index-1;
        }
        index = (end+start)/2;
        i++;
    }
        if (found == true){
            System.out.println(find+" was found in " + i + " iterations");
                
        }
        else
           System.out.println("number not found");
} // end of class
    
} // end of method 