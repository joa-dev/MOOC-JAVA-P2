
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joa-dev
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.stream().forEach(card -> System.out.println(card.toString()));
    }
    
    public void sort() {
		Comparator<Card> comparator = Comparator
				.comparing(Card::getValue)
				.thenComparing(Card::getSuit);

		Collections.sort(cards, comparator);
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand otherHand) {
        int thisValue = this.cards.stream()
                .map( card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        int otherValue = otherHand.cards.stream()
                .map( card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        
        return thisValue - otherValue;
    }
}
