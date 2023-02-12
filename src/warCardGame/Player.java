package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//1: List of Cards for our hand 
	List<Card> hand = new ArrayList<Card>();
	int score; //#2
	String name;  //#3
	
	
	public Player(String name) {
		this.score = 0; //2: asked to be set to 0 in the constructor 
		this.name = name;//#3
	}
	
	public void describe() { //4: prints out info about the player and calls the describe method
		System.out.println("\nPlayer " + name + " " + "has " + score + " points!\n");
		for (Card card : hand) {
			card.describe();
		}
		System.out.println("****************************************************");
	}
	
	public Card flip() { //5: removes and returns the top card of the Hand
		Card drawnTopCard = hand.get(0);
		hand.remove(0);
		return drawnTopCard;
	}
	
	public void draw(Deck deck) { //6: adds the returned card to the hand field
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		this.score++; //7: adds 1 to the players score field 
	}
	
	
}
