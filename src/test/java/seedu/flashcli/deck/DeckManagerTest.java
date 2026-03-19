package seedu.flashcli.deck;

import org.junit.jupiter.api.Test;
import seedu.flashcli.exception.FlashException;

import static org.junit.jupiter.api.Assertions.*;

public class DeckManagerTest {

    @Test
    public void createDeck_newDeckName_success() throws FlashException {
        DeckManager manager = new DeckManager();
        manager.createDeck("CS2040C");
        assertNotNull(manager.getDeck("CS2040C"));
        assertEquals("CS2040C", manager.getDeck("CS2040C").getDeckName());
    }

    @Test
    public void createDeck_duplicateDeckName_throwsException() throws FlashException {
        DeckManager manager = new DeckManager();
        manager.createDeck("EE2026");
        assertThrows(FlashException.class, () -> manager.createDeck("EE2026"));
    }

    @Test
    public void deleteDeck_existingDeck_success() throws FlashException {
        DeckManager manager = new DeckManager();
        manager.createDeck("CG2111A");
        assertTrue(manager.deleteDeck("CG2111A"));
        assertThrows(FlashException.class, () -> manager.getDeck("CG2111A"));
    }

    @Test
    public void deleteDeck_nonExistentDeck_returnsFalse() {
        DeckManager manager = new DeckManager();
        assertFalse(manager.deleteDeck("NonExistent"));
    }

    @Test
    public void getDeck_nonExistentDeck_throwsException() {
        DeckManager manager = new DeckManager();
        assertThrows(FlashException.class, () -> manager.getDeck("MissingDeck"));
    }

    @Test
    public void addAndDeleteCard_throughDeckDirectly_success() throws FlashException {
        DeckManager manager = new DeckManager();
        manager.createDeck("CS2113");
        Deck deck = manager.getDeck("CS2113");

        deck.addCard("What is Unit Testing?", "Testing individual components");
        assertEquals(1, deck.getSize());

        deck.deleteCard(0);
        assertEquals(0, deck.getSize());
    }
}