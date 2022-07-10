package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {
	private Dealer dealer = new Dealer();
	private Player player = new Player();

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.play();
		
	}

	public void play() {
		gameSetup();
		determinePlayerMove();
		dealer.dealerTurn();
		beforeDealerBJ();
		determineDealerMove();
		determineWinner();
	}

	public void gameSetup() {
		dealer.startGame();
		dealer.dealCard(player);
		dealer.dealCard();
		dealer.dealCard(player);
		dealer.dealCard();
		checkGameSetupBJ();

	}
	public void checkGameSetupBJ() {
		if(player.checkPlayerBJ() && dealer.checkDealerBJ()) {
			System.out.println("Dealer and Player have a BlackJack. Both win.");
			System.exit(0);
		}else if(player.checkPlayerBJ()) {
			System.out.println("Player has a BlackJack. Player wins!");
			System.out.println();
			System.out.println("Dealer hand was: ");
			dealer.showDealer();
			System.exit(0);
		}
	}

	public void playerTurn() {
		System.out.println("Players Turn");
	}

	public void dealerTurn() {
		System.out.println("Dealers Turn");
	}
	public void beforeDealerBJ() {
		if(dealer.checkDealerBJ()) {
			dealer.showDealer();
			System.out.println("Dealer has a BlackJack. Dealer wins!");
			System.exit(0);		
		}
		
	}

	public void determineDealerMove() {
		boolean check = true;
		dealer.showDealer();
		while (check) {
			int choice = dealer.dealerValue();
			if (choice >= 17) {
				System.out.println("The Dealer Stays.");
				check = false;
			} else {
				System.out.println("The Dealer Hits.");
				System.out.println("-------------------------------------");
				dealer.dealCard();
			}
		}
	}

	public void determinePlayerMove() {
		boolean keepGoing = true;
		while (keepGoing) {
			int choice = player.playerValue();
			System.out.println("The current value is: " + choice);
			dealer.questionPlayer();
			int userInput = 0;
			userInput = player.playerMove();

			switch (userInput) {
			case 1:
				System.out.println("You decided to Hit, heres another card.");
				System.out.println("-------------------------------------");
				dealer.dealCard(player);
				break;
			case 2:
				System.out.println("You decided to Stay.");
				System.out.println("-------------------------------------");
				keepGoing = false;
				break;
			default:
				System.out.println("You must enter either the number 1 or 2.");
				break;
			}

		}
	}

	public void determineWinner() {
		if (dealer.dealerValue() > player.playerValue()) {
			System.out.println(
					"Dealer's Hand: " + dealer.dealerValue() + " is greater than yours: " + player.playerValue());
			System.out.println("You Lose!");

		} else if (dealer.dealerValue() < player.playerValue()) {
			System.out.println(
					"Your Hand: " + player.playerValue() + " is greater than the dealers: " + dealer.dealerValue());
			System.out.println("You Win!");
		} else {
			System.out.println("Its a Tie.");
		}
	}

}
