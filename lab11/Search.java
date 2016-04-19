// Lindsay Alvarez
// lab11
// create two integer arrays (1 and 2) Create two integer arrays (array1 and array2) of size 50.
//Fill array1 with random integers between 0 and 100
//Use linear search to print out the minimum and maximum values of array1.
//Add increasing random numbers to array2. (The first number should be between 0 and 100).
//Print out the minimum and maximum values of array2.
//Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
//Use binary search to search the array for the inputted value.
//Say if the number was found or not found.
//If the number was not found, print out the numbers below and above the searched for number.


import java.util.Scanner; // input scanner

public class Search{ // define class

    public static int[] search(int[]x,int target){ // main method search 
        int mid=x.length/2;
        if(target==x[mid]){
            System.out.println(target+" was found in the list");
            int[]y=new int[1];
            y[0]=-1;
            return y;
        }
        else if(mid==1&&target>x[mid]){
            System.out.println(target+" was not found in the list");
            int[]y=new int[1];
            y[0]=-1;
            return y;
        }
        else if(mid==0&&target!=x[mid]){
            System.out.println(target+" was not found in the list");
            int[]y=new int[1];
            y[0]=-1;
            return y;
        }
        else if(target<x[mid]){
            int[]y=new int[mid];
            for(int i=0; i<y.length; i++){
                y[i]=x[i];
            }
            return y;
        }
        else if(target>x[mid]&&(x.length%2)!=0){
            int[]y=new int[mid];
            for(int i=0; i<y.length; i++){
                y[i]=x[mid+1+i];
            }
            return y;
        }
        else{
            int[]y=new int[mid-1];
            for(int i=0; i<y.length; i++){
                y[i]=x[mid+1+i];
            }
            return y; // return the value of the else loop 
        }
    }

    public static void main(String[] arg){
        Scanner myScanner=new Scanner(System.in);
        int[] array1=new int[50];
        int[] array2=new int[50];
        for(int i=0;i<50;i++){
            array1[i]=(int)(Math.random()*101);
        }
        int max1, min1;
        max1=array1[0];
        min1=array1[0];
        for(int j=1; j<array1.length; j++){
            if(array1[j]<min1){
                min1=array1[j];
            }
            else if(array1[j]>max1){
                max1=array1[j];
            }
        }
        System.out.println("The maximum value of array1 is: "+max1+" and the minimum value is: "+min1);
        array2[0]=(int)(Math.random()*101);
        for(int k=1; k<50; k++){
            array2[k]=((int)(Math.random()*101))+array2[k-1];
        }
        System.out.println("The maximum value of array2 is: "+array2[49]+" and the minimum value is: "+array2[0]);
        for(int f=0;f<array2.length;f++){
            System.out.print(" "+array2[f]);
        }
        System.out.println("");
        int target=0;
        System.out.println("Enter an int>=0"); // inputting an int that is greater than or equal to 0
        double num=myScanner.nextDouble();
        
        if((num%1)!=0||num<0){
            System.exit(0); 
        }
        
        else{
            target=(int)num;
        }
        int z=0;
        int[] y=search(array2,target); 
        while(z==0){
            y=search(y,target);
            if(y[0]==-1){
                z++;
            }
        }
        
    } // end of method 
} // end of class