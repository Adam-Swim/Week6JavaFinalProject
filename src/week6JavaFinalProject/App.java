package week6JavaFinalProject;


public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();  // Instantiate a deck
		
		System.out.println("\nThe deck has been shuffled\n"); // shuffle the deck and print out that the deck has been shuffled 
		deck.shuffle();
		
		Player player1 = new Player(); // instantiate Player 1
		player1.name = "Player 1";
		
		Player player2 = new Player();  // instantiate Player 2
		player2.name = "Player 2";
		
				
		for (int i = 0; i <52 ; i++) {  // for loop that iterates 52 times and deals the cards to each player alternating
			if (i % 2 == 0) {
				Card drawnCard = deck.draw();
				player1.hand.add(drawnCard);
			} else {
				Card drawnCard = deck.draw();
				player2.hand.add(drawnCard);
			}
		} // end of for loop
		
		for (int i = 0; i <26 ; i++) {  // for loop that iterates 26 times and has each player flip a card and then compares the 
			Card card1 = player1.flip();// two values, incrementing the score of the player with the higher value card
			Card card2 = player2.flip();
			
			
			System.out.println(player1.name + " flipped the " + card1.toString());
			System.out.println(player2.name + " flipped the " + card2.toString());
			
			if (card1.getValue() > card2.getValue()) {
			player1.incrementScore();	
			System.out.println("\n**" + player1.name + " wins this round and the score is now " + player1.score);
		} else if (card2.getValue() > card1.getValue()) {
			player2.incrementScore();
			System.out.println("\n**" + player2.name + " wins this round and the score is now " + player2.score);
		} else {
			System.out.println( "\n** Bummer!! This round is a draw! Flip again.");
		}
			System.out.println("\n------------------------------------------");	
	} // end of for loop
	System.out.println("------------------------------------------");
		
		
		
	System.out.println("The Final score is " + player1.name + " " + player1.score + " " + player2.name + " " + player2.score + "!" );
		if (player1.score > player2.score) {
			System.out.println(player1.name + " wins the game with a score of " + player1.score + "!");
		} else if (player2.score > player1.score) {
			System.out.println(player2.name + " wins the game with a score of " + player2.score + "!");
		} else {
			System.out.println("The game is a draw, both " + player1.name + " and " + player2.name + " have a score of " + player1.score + ".");
		}
		
			
//   I made the below print statements to check if the draw card method worked to deal hands correctly.		
//		System.out.println("\n" + player1.name + " was dealt the following cards: ");
//		player1.describe();
//		
//		System.out.println("\n" + player2.name + " was dealt the following cards: ");
//		player2.describe();
//		

	}// end of main

}// end of app class
