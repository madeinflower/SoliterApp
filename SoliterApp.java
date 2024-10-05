package com.telran.org.lessonten.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoliterApp {

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        for(Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
        //
        List<Card> newDeck = new Soliter().make(deck);
        // newDeck == 4 - it is ok
    }
}
