package spoons;

import java.util.ArrayList;
import java.util.Collections;

import spoons.Card;

public class Deck
{
	 private Card[] deck;   // array of 52 Cards
	    private int cardsUsed;
	    int number_of_players = 4;
	    
	    public Deck() 
	    {
	       deck = new Card[52];
	       int cardCt = 0; // How many cards have been created so far.
	       for ( int suit = 0; suit <= 3; suit++ ) {
	          for ( int value = 1; value <= 13; value++ ) {
	             deck[cardCt] = new Card(value,suit);
	             cardCt++;
	          }
	       }
	       cardsUsed = 0;
	    }
	    
	    public void shuffle() 
	    {
	        for ( int i = 51; i > 0; i-- ) {
	            int rand = (int)(Math.random()*(i+1));
	            Card temp = deck[i];
	            deck[i] = deck[rand];
	            deck[rand] = temp;
	        }
	        cardsUsed = 0;
	    }
	    
	    public int cardsLeft() 
	    {
	        return 52 - cardsUsed;
	    }
	    
	    public Card dealCard() 
	    {
	        if (cardsUsed == 52)
	           shuffle();
	        cardsUsed++;
	        return deck[cardsUsed - 1];
	    }
	    
	    public void drawPile()
	    {
	    	java.util.ArrayList<Card> draw_pile;
	    }
	    
	   public void discardPile()
	    {
	    	 java.util.ArrayList<Card> discard_pile;
	    }
}
