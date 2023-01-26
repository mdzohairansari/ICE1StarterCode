package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @modifier Zohair Ansari Jan 25, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        // Generating random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1 + Math.random()*13));		
            card.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            hand[i] = card;
            System.out.println(hand[i].getSuit() + " " + hand[i].getValue());
        }
        
        // Taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Card Value: ");
        int userCardValue = input.nextInt();
        
        System.out.print("Enter the Card Suit: ");
        String userCardSuit = input.next();
        
        System.out.println("Your Card Value: " + userCardValue + "\nYour Card Suit: " + userCardSuit);
        
        // Creating user's card
        Card userCard = new Card();
        userCard.setValue(userCardValue);
        userCard.setSuit(userCardSuit);
        
        // Matching user's card with random generated cards
        for (int i = 0; i < hand.length; i++) {
            if (userCardValue == hand[i].getValue() && userCardSuit.equalsIgnoreCase(hand[i].getSuit())) {
                printInfo();
                break;
            }
        }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Zohair Ansari and I am from India");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Meet and work with people from big Tech companies");
        System.out.println("-- Build a tech startup!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Watching YouTube");
        System.out.println("-- Reading");
        System.out.println("-- Blogging");
        System.out.println("-- Editing videos");

        System.out.println();
        
    
    }

}
