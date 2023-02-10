package week6JavaFinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	String name;
	int score = 0;
	

	
	public void describe() {
		for (Card card : this.hand) {
			card.describe();
		}
		
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		this.hand.add(card);
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		
		return card;
	}
	

}
