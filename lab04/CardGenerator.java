// Lindsay Alvarez
// lab04
// Card generator: user picks random card from deck to practice tricks
//2/19/16
// 1-13 are diamonds
//14-26 are clubs
//27-39 are hearts
//40-52 are spades

public class CardGenerator { // start of class
public static void main (String [ ] args) { // start of main method
    
    int upperBound = 52;  // defining upper bound as the entire deck of 52 cards 
    int baseNum = 1; // the random numbers can be chosen from the base number which is 1
    int randomRank = (int)(Math.random()*13) + 1; // choosing a random rank for the card and the ranks range from 1-13
    int randomSuit = (int)(Math.random()*4) + 1; // choosing a random suit for the card and the suits range from numbers 1-4

    
    String suit = " " ; // suit string 
    String rank = " "; // rank string
    switch(randomRank % 13) {  // start of switch method for choosing a card within a range of cards
        case 1: 
        rank = "Ace"; // the rank of the card
            break; 
            case 2: // case for the switch statement 
            rank = "2";
             break;
            case 3:
             rank = "3";
                    break;
                    case 4:
                        rank = "4";
                        break;
                        case 5:
                            rank = "5";
                            break;
                            case 6:
                                rank = "6";
                                break;
                                case 7:
                                    rank = "7";
                                    break;
                                    case 8:
                                        rank = "8";
                                        break;
                                        case 9:
                                            rank = "9";
                                            break;
                                            case 10:
                                                rank = "10";
                                                break;
                                                case 11:
                                                    rank = "Jack";
                                                    break;
                                                    case 12:
                                                        rank = "Queen";
                                                        break;
                                                        case 13:
                                                            rank = "King";
                                                            break;
                                                            
                                                            
    } // closing switch statement
   
   switch (randomSuit % 4) { // switch for the random suit and module
   case 1: 
       suit = "Clubs"; // suit of clubs
       break;
       case 2: 
           suit = "Spades"; // suit of spades
           break;
           case 3: 
               suit = "Hearts"; // suit of hearts
               break;
               case 4: 
                   suit = "Diamonds"; // suit of diamonds
                   break;
   
   }// closing switch statement for randomSuit
    
    System.out.println("You picked the " + (rank) + "of" + (suit) );
    
    
            
            
        
    
} // end of main method 
    
} // end of class
