package week6JavaFinalProject;

public class Card {
	String name;
	String suit;
	int value;
	
	
	Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		System.out.println(this.name + " of " + this.suit + " -- " + this.value);
	}
	
	@Override
	public String toString() {
		return name + " of " + suit; // added this toString method to print the suits and card names and 
	}                                // to avoid printing the reference of the card class.

}

