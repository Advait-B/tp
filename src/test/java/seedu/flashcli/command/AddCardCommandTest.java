package seedu.flashcli.command;

import org.junit.jupiter.api.Test;
import seedu.flashcli.deck.Deck;
import seedu.flashcli.deck.DeckManager;

import static org.junit.jupiter.api.Assertions.*;

public class AddCardCommandTest {


    @Test
    public void execute_validCard_cardAddedToDeck() {
        DeckManager deckManager = new DeckManager();
        Command commandCreateDeck = new CreateDeckCommand("MA1513");
        commandCreateDeck.execute(deckManager);
        Command commandAddCard = new AddCardCommand("MA1513", "1+1", "2");
        assertFalse(commandAddCard.execute(deckManager));
        assertEquals("Question: 1+1",deckManager.getDeck("MA1513").getCard(0).getQuestionString());
        assertEquals("Answer: 2",deckManager.getDeck("MA1513").getCard(0).getAnswerString());
        assertEquals(1, deckManager.getDeck("MA1513").getSize());
    }


}
