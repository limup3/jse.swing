package com.jse.card;

public class CardServiceImpl implements CardService {

	private Card[] cards;
	private int count;
	
	public CardServiceImpl() {

		cards = new Card[3];
		count = 0;
	}
	
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public Card[] getCards() {
		return cards;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void add(Card card) {
		cards[count] = card;
		count++;
	}
	
	public String printCard() {
		String result = "";
		Card[] cards = getCards();
		for (int i = 0; i < 3; i++) {
			
			result += String.format("카드모양 : %s , 카드넘버 : %d" +"\n",
					cards[i].getKind(),
					cards[i].getNumber()); 
					
		}
		return result;
	}
}
