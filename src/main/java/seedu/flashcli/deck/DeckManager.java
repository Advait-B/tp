package seedu.flashcli.deck;

import java.util.ArrayList;

public class DeckManager {
    private ArrayList<Deck> deckList = new ArrayList<>();

    /**
     * takes in the deckName, creates a new Deck object and
     * adds it to the deckList
      */

    public void createDeck(String deckName) {
        Deck newDeck = new Deck(deckName);
        deckList.add(newDeck);
        System.out.println("Deck added!");
    }

    /**
     * prints out the deckName of every deck
     */
    public void listDecks() {
        int count = 1;
        for (Deck deck : deckList) {
            System.out.printf("%d. %s%n", count, deck.getDeckName());
            count++;
        }
    }

    /**
     * deletes the Deck object at the specified index of the deckList
     */
    public void deleteDeck(int deckIndex) {
        deckList.remove(deckIndex);
        System.out.printf("deck %d removed!\n", deckIndex+1);
    }

    /**
     * returns the Deck object at the specified index of the deckList
     */
    public Deck getDeck(int deckIndex) {
        return deckList.get(deckIndex);
    }

}
