
package com.skilldistillery.blackjack.entities;

public class Dealer {
	private Deck deck = new Deck();
	private DealerHand dHand = new DealerHand();
	private int turn = 1;

	public Dealer() {

	}

	public void startGame() {
		pickDeck();

		shuffleDeck();

	}

	public void pickDeck() {
		deck.createDeck();
	}

	public void shuffleDeck() {
		deck.shuffle();

	}

	public void dealCard(Player player) {
		player.receieveCard(deck.dealtCard());
	}

	public void dealCard() {
		receieveCard(deck.dealtCard());
	}

	
	public boolean checkDealerBJ() {
		return dHand.isBlackJack();
	}

	public void receieveCard(Card newCard) {
		dealerTurn();
		dHand.addCard(newCard);
		showDealer();
		dHand.isBust();
	}

	public void questionPlayer() {
		System.out.println("Would you like to '1. Hit' or '2. Stay'?");
	}

	public void showDealer() {
		if (turn == 1) {
			System.out.println("[MysteryCard]");
			System.out.println("-------------------------------------");
		}
		if (turn == 2) {
			System.out.println("Current Score: " + dHand.cards.get(1).getValue());
			System.out.println("[" + dHand.cards.get(1) + ", MysteryCard]");
			System.out.println("-------------------------------------");
		}
		if (turn > 2) {
			showCard();
		}
		turn++;

	}

	public void showCard() {
		System.out.println("Current Score: " + dHand.getHandValue());
		dHand.showCards();
		System.out.println("-------------------------------------");
	}

	public void dealerTurn() {
		System.out.println("Dealers Turn");
	}

	public int dealerValue() {
		return dHand.getHandValue();
	}

}
