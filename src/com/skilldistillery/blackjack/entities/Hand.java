package com.skilldistillery.blackjack.entities;

import java.util.*;

public abstract class Hand {
	protected List<Card> cards;

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public Hand() {

	}

	public Hand(List<Card> cards) {
		this.cards = cards;
	}

	public void addCard(Card card) {

	}

	public void clear() {

	}

	public void showCards() {

	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [getHandValue()=" + getHandValue() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
