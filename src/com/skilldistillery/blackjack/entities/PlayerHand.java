package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class PlayerHand extends BlackJackHand {
	protected List<Card> cards = new ArrayList<>();

	public PlayerHand() {
	}

	@Override
	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			System.out.println("Player hit a BlackJack! Player wins");
			System.exit(0);
		}
		return false;
	}

	@Override
	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("BUST! You went over 21, Dealer wins. ");
			System.exit(0);
		}
		return false;
	}

	@Override
	public boolean isHard() {
		return super.isHard();
	}

	@Override
	public boolean isSoft() {
		return super.isSoft();
	}

	@Override
	public void addCard(Card card) {
		cards.add(card);
	}

	@Override
	public void clear() {
		super.clear();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int getHandValue() {
		int count = 0;
		for (int i = 0; i < cards.size(); i++) {
			count += cards.get(i).getValue();
		}
		return count;
	}

	public void showCards() {
		System.out.println(cards.toString());
	}

}
