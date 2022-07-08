package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Deck {
	private List<Card> deck;
	
	public Deck() {
		this.deck =createDeck();
	}
	public List<Card> createDeck() {
		List<Card> deck = new ArrayList<>();
		for(Suit s : Suit.values()) {
	      for(Rank r : Rank.values()) {
	        deck.add(new Card(r, s));
	      }
	    }
	    return deck;
	}
	
	public int cardsLeftInDeck () {
		int cardsLeft = 0;
		cardsLeft =deck.size();
		return cardsLeft;
	}
	public void dealCard (int howMany) {
		while(howMany>0) {
		Card dealtCard;
		dealtCard =deck.remove(0);
		howMany--;
		System.out.println(dealtCard.toString() + dealtCard.getValue());
		}
		
	}
//	public Card dealCard (Hand hand) {
//		
//		return dealCard();
//		
//	}
	public void shuffle () {
		Collections.shuffle(deck);
	}
}
