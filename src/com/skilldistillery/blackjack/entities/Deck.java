package com.skilldistillery.blackjack.entities;

import java.util.*;

public class Deck {
	private List<Card> deck;

	public Deck() {
		this.deck = createDeck();
	}

	public List<Card> createDeck() {
		List<Card> deck = new ArrayList<>();
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
		return deck;
	}

	public int cardsLeftInDeck() {
		int cardsLeft = 0;
		cardsLeft = deck.size();
		return cardsLeft;
	}

	public Card dealCard() {
		Card dealtCard;
		dealtCard = deck.remove(0);

		return dealtCard;
	}

	public Card dealtCard() {

		return dealCard();

	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public int size() {
		return 0;
	}
}
