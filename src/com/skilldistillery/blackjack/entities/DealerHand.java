package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class DealerHand extends BlackJackHand {
	protected List<Card> cards = new ArrayList<>();

	public DealerHand() {

	}

	@Override
	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isBust() {
		if (getHandValue() > 21) {
			showCards();
			System.out.println("BUST! Dealer went over 21, You wins. ");
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
