package exercise1;
import java.util.*;

/**
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

    }

    // I'm done!
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
