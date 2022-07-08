package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"),
	SPADES("Spades"),
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");
	
	private String name;
	
	@Override
	public String toString() {
		return name;
	}

	Suit(String name){
		this.name = name;
	}
}
