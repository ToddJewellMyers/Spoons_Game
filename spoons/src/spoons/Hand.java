package spoons;

import java.util.ArrayList;

import spoons.Card;

public class Hand 
{

	private ArrayList<Card> hand;

	public Hand()
	{
		 hand = new ArrayList<Card>();
	}
	
	 public void clear() 
	   {
	      hand.clear();
	   }

	public void addCard(Card c)
	{
		  hand.add(c);
	}

	 public void removeCard(Card c) 
	   {
		 
	      hand.remove(c);
	   }
	 public void removeCard(int position) 
	   {
	      if (position < 0 || position >= hand.size())
	      hand.remove(position);
	   }
	 public int cardCount() 
	   {
	      return hand.size();
	   }
	 public void getCard(int position) 
	   {
	      if (position < 0 || position >= hand.size())
	       return;
	   }
	      public void sortBySuit()
	      {
	         ArrayList<Card> newHand = new ArrayList<Card>();
	         while (hand.size() > 0) {
	            int pos = 0;  // Position of lowest card.
	            Card c = (Card)hand.get(0);  // lowest card.
	            for (int i = 1; i < hand.size(); i++) {
	               Card c1 = (Card)hand.get(i);
	               if ( c1.getSuit() < c.getSuit() ||
	                       (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) {
	                   pos = i;
	                   c = c1;
	               }
	            }
	            hand.remove(pos);
	            newHand.add(c);
	         }
	         hand = newHand;
	      }
	      public void sortByValue() 
	      {
	         ArrayList<Card> newHand = new ArrayList<Card>();
	         while (hand.size() > 0) {
	            int pos = 0;  // Position of lowest card.
	            Card c = (Card)hand.get(0);  // lowest card.
	            for (int i = 1; i < hand.size(); i++) {
	               Card c1 = (Card)hand.get(i);
	               if ( c1.getValue() < c.getValue() ||
	                       (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()) ) {
	                   pos = i;
	                   c = c1;
	               }
	            }
	            hand.remove(pos);
	            newHand.add(c);
	         }
	         hand = newHand;
	      }
	      @Override
	      public String toString()
	      {
	          String result = hand.size() + " cards:" + System.lineSeparator();
	          for (Card card : hand)
	          {
	              result = result.concat(card + System.lineSeparator());
	          }

	          return result;
	      }
	      public static boolean winner()
	      {
	    	  
	    	  System.out.println("You win!");
			return false;
	    	  
	      }
}
