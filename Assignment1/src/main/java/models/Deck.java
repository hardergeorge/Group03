package models;

/**
 * A representation of the deck class in the Aces Up game
 */
public class Deck {
    int numCards;
    Card[] cards;

    public Deck () {
        numCards = 52;
        cards = new Card[52];
    }

    public int getNumCards() {
        return numCards;
    }

    public Card getACard (int index) {
        return cards[index];
    }

    public void buildDeck () {
        for (int i = 0; i < 13; i++) {
            cards[i] = new Card(i+2, 'd', false);
        }
        for (int i = 0; i < 13; i++) {
            cards[i+13] = new Card(i+2, 'h', false);
        }
        for (int i = 0; i < 13; i++) {
            cards[i+26] = new Card(i+2, 's', false);
        }
        for (int i = 0; i < 13; i++) {
            cards[i+39] = new Card(i+2, 'c', false);
        }
    }
}
