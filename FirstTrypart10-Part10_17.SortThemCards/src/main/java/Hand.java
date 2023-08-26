
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

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : this.hand) {
            System.out.println(card.toString());
        }
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand otherHand) {
        int thisValue = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        int otherValue = otherHand.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);

        return thisValue - otherValue;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
