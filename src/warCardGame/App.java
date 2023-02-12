package warCardGame;

public class App {

	public static void main(String[] args) {
		
		Deck fullDeck= new Deck();             //1: instantiates a deck
		
		fullDeck.shuffle();					   //AND call shuffle method on fullDeck
		
		Player player1 = new Player("Shaggy");
		Player player2 = new Player("Scooby"); 
		
		for(int i = 1; i <= 26; i++) {
			player1.hand.add(fullDeck.draw()); //2: for loop iterating 52 times calling the draw method 
			player2.hand.add(fullDeck.draw()); 
		}
		
		player1.describe();
		player2.describe();
		
		for(int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip(); //3: for loop iterating 26 times using the flip method 
			Card player2Card = player2.flip();
			
			//4: using the incrementScore method on the player whose card has the higher value 
			if (player1Card.getcardValue() > player2Card.getcardValue()) {
				player1.incrementScore();
			}else if (player2Card.getcardValue() > player1Card.getcardValue()) {
				player2.incrementScore();
			}else {
				System.out.println("\nDraw!\n");
			}
		}
		
		//5: after our loop, we compare the final score from each player
		//And then we print the final score of each player 
		if (player1.score > player2.score) {
			System.out.println("*************************************************");
			System.out.println(player1.name + "'s " + "final score is: " + player1.score + "\n");
			System.out.println(player2.name + "'s " + "final score is: " + player2.score + "\n");
			System.out.println(player1.name + " wins this round! \n");
			System.out.println("*************************************************");
		}else if(player2.score > player1.score) {
			System.out.println("*************************************************");
			System.out.println(player1.name + "'s " + "final score is: " + player1.score + "\n");
			System.out.println(player2.name + "'s " + "final score is: " + player2.score + "\n");
			System.out.println(player2.name + " wins this round! \n");
			System.out.println("*************************************************");
		}else {
			System.out.println("*************************************************");
			System.out.println(player1.name + "'s " + "final score is: " + player1.score + "\n");
			System.out.println(player2.name + "'s " + "final score is: " + player2.score + "\n");
			System.out.println("Draw! There are no winners this round!\n"); 
			System.out.println("*************************************************");
		}
	}//End of main method
}//End of main class 