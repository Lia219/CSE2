// Lindsay Alvarez
// lab04
// Card generator: user picks random card from deck to practice tricks
//2/19/16
// 1-13 are diamonds
//14-26 are clubs
//27-39 are hearts
//40-52 are spades

public class Card Generator { // start of class
public static void main (String [ ] args) { // start of main method
    
    int card = (int) (Math.random()*(upperBound+1)) + baseNUm; // user can generate a random number 
    int card = (int)(Math.random()*52) + 1 ; // random number between 2 and 52 because we are not including the 1
    String suit = ""; // suit string 
    String rank = ""; // rank string
    switch(card % 13) {  // switch method for choosing a card within a range of cards
        case 1: 
            rank = "1"; // the rank of the card
            break;
            case 2:
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
    suits = (("Hearts") ("Diamonds") ("Spades") ("Clubs"));
    
    
            
            
        
    
} // end of main method 
    
} // end of class
