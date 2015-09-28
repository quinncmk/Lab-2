package pokerBase;

import static org.junit.Assert.*;

import org.junit.Test;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class HandTest {
	eSuit hearts = eSuit.HEARTS;
	eSuit spades = eSuit.SPADES;
	eSuit clubs = eSuit.CLUBS;
	eSuit diamonds = eSuit.DIAMONDS;
	eRank ace = eRank.ACE;
	eRank two = eRank.TWO;
	eRank three = eRank.THREE;
	eRank four = eRank.FOUR;
	eRank five = eRank.FIVE;
	eRank six = eRank.SIX;
	eRank seven = eRank.SEVEN;
	eRank eight = eRank.EIGHT;
	eRank nine = eRank.NINE;
	eRank ten = eRank.TEN;
	eRank jack = eRank.JACK;
	eRank queen = eRank.QUEEN;
	eRank king = eRank.KING;

	@Test
	// Test royal flush in EvalHand()
	public void RoyalFlushTest() {
		
		// Create a new instance of Hand class
		Hand royalFlush = new Hand();

		// Making cards to royal flush
		Card card1 = new Card(spades, ten, 1);
		Card card2 = new Card(spades, jack, 1);
		Card card3 = new Card(spades, queen, 1);
		Card card4 = new Card(spades, king, 1);
		Card card5 = new Card(spades, ace, 1);
		
		// Adding cards to hand
		royalFlush.AddCardToHand(card1);
		royalFlush.AddCardToHand(card2);
		royalFlush.AddCardToHand(card3);
		royalFlush.AddCardToHand(card4);
		royalFlush.AddCardToHand(card5);
		
		// Call evaluate hand
		royalFlush.EvalHand();
		
		// Test royal flush
		assertEquals(100, royalFlush.getHandStrength());
	}
	
	// Test straight flush in EvalHand()
	public void StraightFlushTest() {
		
		// Create a new instance of Hand class
		Hand straightFlush = new Hand();

		// Making cards to straight flush
		Card card1 = new Card(clubs, three, 1);
		Card card2 = new Card(clubs, four, 1);
		Card card3 = new Card(clubs, five, 1);
		Card card4 = new Card(clubs, six, 1);
		Card card5 = new Card(clubs, seven, 1);
		
		// Adding cards to hand
		straightFlush.AddCardToHand(card1);
		straightFlush.AddCardToHand(card2);
		straightFlush.AddCardToHand(card3);
		straightFlush.AddCardToHand(card4);
		straightFlush.AddCardToHand(card5);
		
		// Call evaluate hand 
		straightFlush.EvalHand();
		
		// Test straight flush
		assertEquals(90, straightFlush.getHandStrength());
	}
	
	// Test four of a kind in EvalHand()
	public void FourOfAKindTest() {
		
		// Create a new instance of Hand class
		Hand fourOfAKind = new Hand();

		// Making cards to four of a kind
		Card card1 = new Card(spades, nine, 1);
		Card card2 = new Card(diamonds, nine, 1);
		Card card3 = new Card(hearts, nine, 1);
		Card card4 = new Card(clubs, nine, 1);
		Card card5 = new Card(spades, seven, 1);
		
		// Adding cards to hand
		fourOfAKind.AddCardToHand(card1);
		fourOfAKind.AddCardToHand(card2);
		fourOfAKind.AddCardToHand(card3);
		fourOfAKind.AddCardToHand(card4);
		fourOfAKind.AddCardToHand(card5);

		// Call evaluate hand
		fourOfAKind.EvalHand();
		
		// Test four of a kind
		assertEquals(80, fourOfAKind.getHandStrength());
	}
	
	// Test full house in EvalHand()
	public void FullHouseTest() {
		
		// Create a new instance of Hand class
		Hand fullHouse = new Hand();

		// Making cards to full house
		Card card1 = new Card(diamonds, three, 1);
		Card card2 = new Card(spades, three, 1);
		Card card3 = new Card(hearts, three, 1);
		Card card4 = new Card(clubs, king, 1);
		Card card5 = new Card(spades, king, 1);
		
		// Adding cards to hand
		fullHouse.AddCardToHand(card1);
		fullHouse.AddCardToHand(card2);
		fullHouse.AddCardToHand(card3);
		fullHouse.AddCardToHand(card4);
		fullHouse.AddCardToHand(card5);

		// Calling evaluate hand 
		fullHouse.EvalHand();
		
		// Test full house
		assertEquals(70, fullHouse.getHandStrength());
	}

	// Test flush in EvalHand()
	public void FlushTest() {
		
		// Create a new instance of Hand class
		Hand flush = new Hand();

		// Making cards to flush
		Card card1 = new Card(clubs, four, 1);
		Card card2 = new Card(clubs, six, 1);
		Card card3 = new Card(clubs, nine, 1);
		Card card4 = new Card(clubs, queen, 1);
		Card card5 = new Card(clubs, king, 1);
		
		// Adding cards to hand
		flush.AddCardToHand(card1);
		flush.AddCardToHand(card2);
		flush.AddCardToHand(card3);
		flush.AddCardToHand(card4);
		flush.AddCardToHand(card5);

		// Calling evaluate hand
		flush.EvalHand();
		
		// Test flush
		assertEquals(60, flush.getHandStrength());
	}

	// Test straight in EvalHand()
	public void StraightTest() {
		
		// Create a new instance of hand class
		Hand straight = new Hand();

		// Making cards to straight
		Card card1 = new Card(clubs, seven, 1);
		Card card2 = new Card(spades, eight, 1);
		Card card3 = new Card(diamonds, nine, 1);
		Card card4 = new Card(hearts, ten, 1);
		Card card5 = new Card(spades, jack, 1);

		// Adding cards to hand
		straight.AddCardToHand(card1);
		straight.AddCardToHand(card2);
		straight.AddCardToHand(card3);
		straight.AddCardToHand(card4);
		straight.AddCardToHand(card5);
		
		// Calling evaluate hand
		straight.EvalHand();
		
		// Test straight
		assertEquals(50, straight.getHandStrength());
	}

	// Test three of a kind in evalHand()
	public void ThreeOfAKindTest() {
		
		// Create a new instance of hand class
		Hand threeOfAKind = new Hand();

		// Making cards to three of a kind
		Card card1 = new Card(spades, queen, 1);
		Card card2 = new Card(diamonds, queen, 1);
		Card card3 = new Card(diamonds, queen, 1);
		Card card4 = new Card(spades, six, 1);
		Card card5 = new Card(clubs, ace, 1);
		
		// Adding cards to hand 
		threeOfAKind.AddCardToHand(card1);
		threeOfAKind.AddCardToHand(card2);
		threeOfAKind.AddCardToHand(card3);
		threeOfAKind.AddCardToHand(card4);
		threeOfAKind.AddCardToHand(card5);

		// Calling evaluate hand
		threeOfAKind.EvalHand();

		// Test three of a kind
		assertEquals(40, threeOfAKind.getHandStrength());
	}
	
	// Test two pairs in EvalHand()
	public void TwoPairTest() {
		
		// Create a new instance of hand class
		Hand twoPair = new Hand();

		// Making cards to two pairs
		Card card1 = new Card(hearts, two, 1);
		Card card2 = new Card(spades, two, 1);
		Card card3 = new Card(diamonds, nine, 1);
		Card card4 = new Card(clubs, king, 1);
		Card card5 = new Card(spades, king, 1);

	    // Adding cards to hand
		twoPair.AddCardToHand(card1);
		twoPair.AddCardToHand(card2);
		twoPair.AddCardToHand(card3);
		twoPair.AddCardToHand(card4);
		twoPair.AddCardToHand(card5);
		
		// Calling evaluate hand
		twoPair.EvalHand();
		
		// Test two pairs
		assertEquals(30, twoPair.getHandStrength());
	}
	
	// Test pair in EvalHand()
	public void PairTest() {
		
		// Create a new instance of hand class
		Hand Pair = new Hand();

		// Making cards to pair
		Card card1 = new Card(diamonds, three, 1);
		Card card2 = new Card(clubs, king, 1);
		Card card3 = new Card(spades, jack, 1);
		Card card4 = new Card(diamonds, five, 1);
		Card card5 = new Card(clubs, five, 1);

		// Adding cards to hand 
		Pair.AddCardToHand(card1);
		Pair.AddCardToHand(card2);
		Pair.AddCardToHand(card3);
		Pair.AddCardToHand(card4);
		Pair.AddCardToHand(card5);

		// Calling evaluate hand
		Pair.EvalHand();

		// Test pair
		assertEquals(20, Pair.getHandStrength());
	
	}
	
	// Test no pair in EvalHand()
	public void NoPairTest() {
		
		// Create a new instance of hand
		Hand noPair = new Hand();

		// Making cards to no pair
		Card card1 = new Card(diamonds, six, 1);
		Card card2 = new Card(clubs, nine, 1);
		Card card3 = new Card(spades, two, 1);
		Card card4 = new Card(diamonds, king, 1);
		Card card5 = new Card(clubs, queen, 1);

		// Adding cards to hand
		noPair.AddCardToHand(card1);
		noPair.AddCardToHand(card2);
		noPair.AddCardToHand(card3);
		noPair.AddCardToHand(card4);
		noPair.AddCardToHand(card5);
		
		// Calling evaluate hand
		noPair.EvalHand();

		// Test no pair
		assertEquals(10, noPair.getHandStrength());
	
	}
}
