package seedu.flashcli.study;

import org.junit.jupiter.api.Test;
import seedu.flashcli.deck.Deck;
import seedu.flashcli.exception.FlashException;

import static org.junit.jupiter.api.Assertions.*;

public class StudySessionTest {

    private Deck createSampleDeck() {
        Deck deck = new Deck("Java Basics");
        deck.addCard("What is JVM?", "Java Virtual Machine");
        deck.addCard("What is JRE?", "Java Runtime Environment");
        return deck;
    }

    @Test
    public void getCurrentCard_validIndex_returnsCard() throws FlashException {
        StudySession session = new StudySession(createSampleDeck());
        assertEquals("What is JVM?", session.getCurrentCard().getQuestion());
    }

    @Test
    public void nextCard_multipleCards_traversesSuccessfully() {
        StudySession session = new StudySession(createSampleDeck());
        assertFalse(session.nextCard()); // moves to index 1, not finished
        assertTrue(session.nextCard());  // moves to index 2, finished
    }

    @Test
    public void isFinished_newSession_notFinished() {
        StudySession session = new StudySession(createSampleDeck());
        assertFalse(session.isFinished());
    }

    @Test
    public void isFinished_emptyDeck_isFinished() {
        StudySession session = new StudySession(new Deck("Empty"));
        assertTrue(session.isFinished());
    }

    @Test
    public void finish_activeSession_resetsIndex() {
        StudySession session = new StudySession(createSampleDeck());
        int reviewed = session.finish();
        assertTrue(reviewed >= 0);
        assertTrue(session.isFinished());
    }
}