package com.skilldistillery.blackjack.entities;

import java.util.List;

public class BlackJackHand extends Hand {
	protected List<Card> cards;

	@Override
	public void addCard(Card card) {
		super.addCard(card);
	}

	@Override
	public void clear() {
		super.clear();
	}

	@Override
	public String toString() {
		return super.toString();

	}

	public BlackJackHand() {

	}

	public int getHandValue() {

		return 0;
	}

	public boolean isBlackJack() {
		return true;
	}

	public boolean isBust() {
		return true;

	}

	public boolean isHard() {
		return true;

	}

	public boolean isSoft() {
		return true;
	}

}
