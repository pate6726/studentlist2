/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class CardTrick {

   
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            
            //an array to hold 7 cards
            Card[] hand=new Card[9];
            
            //create random class object to generate random numbers
            Random random=new Random();
            
            //1)generates random 7 cards for a hand
            for(int i=0;i<hand.length;i++)
            {
                int value=random.nextInt(13)+1;
                String suit=Card.SUITS[random.nextInt(4)];
                
                Card card=new Card(value,suit);
                hand[i]=card; 
            }

            System.out.println("Cards in Hand: ");
            
            for(Card card:hand)
            {
                System.out.println(card.getValue()+ " of "+card.getSuit());
            }
            
            
            //2) user input for user card
            
            for(int i=0;i<Card.SUITS.length;i++)
            {
                System.out.println((i+1)+": "+Card.SUITS[i]);
            }
            
            System.out.println("Pick a suit for your card: ");
            int suit=input.nextInt();
            
            System.out.println("Enter a value (1 to 13) for card value: ");
            int value=input.nextInt();
            
            Card userCard=new Card(value,Card.SUITS[suit-1]);
            
            //3) check for match of usercard in hand
            
            boolean match=false;
            for(Card card: hand)
            {
                if((card.getValue()==userCard.getValue())&& (card.getSuit().equals(userCard.getSuit())))
                        {
                            match=true;//it's match
                            break;//no need to contiue
                        }
                
            }
            System.out.println("Did you guess it?: "+match);
            
            
            
            
            
            
            
            
            

            
            
            
            
            
            
            
    }

}
