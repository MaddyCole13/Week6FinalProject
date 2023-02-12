package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//private Card{} cards = new Card{52}; //array size set to 52 since there are 52 cards in a typical card deck
	
	
	//1: this is our list of Cards 
	List<Card> cards = new ArrayList<Card>();  //use arrayList since it maintains order
	
	/*
	 * The constructor for Deck class - adding cards to deck
	 * 'n' for loop made for cardName which are the suits in the deck
	 * 'v' for loop made for cardValue which is the values of the cards in the deck
	 */
	public Deck () {
		for (int n =0; n < 4; n ++) {
			for (int v = 2; v <= 14; v++) {
				cards.add(new Card (n, v)); 
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards; 
	}
	
	//3: our draw method to draw top card from top of deck
	public Card draw() {
		if (cards.isEmpty()) {
			return null;
		}else {
			Card drawnTopCard = cards.get(0);
			cards.remove(0);
			return drawnTopCard;
		}
	}
	
	//2: And the shuffle method to shuffle cards over 52 iterations
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	

}//end of Deck class
