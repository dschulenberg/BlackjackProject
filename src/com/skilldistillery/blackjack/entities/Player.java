package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player {
	private PlayerHand pHand = new PlayerHand();
	int turn = 1;

	public Player() {

	}

	public void receieveCard(Card newCard) {
		playerTurn();
		pHand.addCard(newCard);
		showCard();
		if (turn <= 2) {
			pHand.isBlackJack();
		}
		pHand.isBust();
		turn++;
	}

	public int playerMove() {
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		return userInput = tryCatchInt(userInput, scan);

	}

	public int tryCatchInt(int number, Scanner scan) {
		boolean start = true;
		do {
			try {
				number = scan.nextInt();
				if (number == 1 || number == 2) {
					start = false;
				} else {
					System.out.println("You must enter 1 or 2. Try again.");
				}
			} catch (Exception e) {
				System.out.println("You must enter 1 or 2. Try again.");
				scan.nextLine();
				System.out.println();
			}
		} while (start);
		return number;
	}

	public void showCard() {
		System.out.println("Current Score: " + pHand.getHandValue());
		pHand.showCards();
		System.out.println("-------------------------------------");
	}

	public void playerTurn() {
		System.out.println("Players Turn");
	}

	public int playerValue() {
		return pHand.getHandValue();
	}
}
