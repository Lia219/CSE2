//Lindsay Alvarez
// lab09
// 3/25/16
// Methods lab 
import java.util.Scanner;

//define a class
public class Methods{
    
//add main method
    public static void main(String[] args){
        boolean answer=false; 
        int num; // declaring int
        for(int i=0; i<1; i=i){ 
            num=(int)(Math.random()*10); 
            String word1=adjectives(num);
            num=(int)(Math.random()*10);
            String word2=adjectives(num);
            num=(int)(Math.random()*10);
            String word3=nouns(num);
            num=(int)(Math.random()*10);
            String word4=verbs(num);
            num=(int)(Math.random()*10);
            String word5=adjectives(num);
            num=(int)(Math.random()*10);
            String word6=nouns(num);
            System.out.println("The "+word1+" "+word2+" "+word3+" "+word4+" the "+word5+" "+word6+".");
            Scanner myScanner=new Scanner(System.in);
            System.out.println("Would you like another sentence?(1 for yes, 0 for no)");
            int repeat=myScanner.nextInt();
            if(repeat==1){
                i=0;
            }
            else{
                i++;
            }
        }
    }
    
    public static String adjectives(int x){
        String answer=" ";
        String y=Integer.toString(x);
        switch(y){
            case("0"):
                answer="high";
                break;
            case("1"):
                answer="slow";
                break;
            case("2"):
                answer="blue";
                break;
            case("3"):
                answer="loquacious";
                break;
            case("4"):
                answer="ugly";
                break;
            case("5"):
                answer="smelly";
                break;
            case("6"):
                answer="big";
                break;
            case("7"):
                answer="fat";
                break;
            case("8"):
                answer="loud";
                break;
            case("9"):
                answer="quirky";
                break;
        }
        return answer;
    }
    
    public static String nouns(int x){
        String answer=" ";
        String y=Integer.toString(x);
        switch(y){
            case("0"):
                answer="fox";
                break;
            case("1"):
                answer="dog";
                break;
            case("2"):
                answer="koala";
                break;
            case("3"):
                answer="human";
                break;
            case("4"):
                answer="cat";
                break;
            case("5"):
                answer="hawk";
                break;
            case("6"):
                answer="raccoon";
                break;
            case("7"):
                answer="horse";
                break;
            case("8"):
                answer="tiger";
                break;
            case("9"):
                answer="jaguar";
                break;
        }
        return answer;
    }
    
    public static String verbs(int x){
        String answer=" ";
        String y=Integer.toString(x);
        switch(y){
            case("0"):
                answer="pushed";
                break;
            case("1"):
                answer="tackled";
                break;
            case("2"):
                answer="chased";
                break;
            case("3"):
                answer="followed";
                break;
            case("4"):
                answer="trashed";
                break;
            case("5"):
                answer="kicked";
                break;
            case("6"):
                answer="slapped";
                break;
            case("7"):
                answer="pushed";
                break;
            case("8"):
                answer="yeeted";
                break;
            case("9"):
                answer="smacked";
                break;
        }
        return answer;
    }
}