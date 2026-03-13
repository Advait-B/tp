package seedu.flashcli.command;

import org.junit.jupiter.api.Test;
import seedu.flashcli.deck.DeckManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeleteCardCommandTest {
    @Test
    public void execute_validCard_cardDeletedFromDeck() {
        DeckManager deckManager = new DeckManager();
        Command commandCreateDeck = new CreateDeckCommand("MA1513");
        commandCreateDeck.execute(deckManager);
        Command commandAddCard = new AddCardCommand("MA1513", "1+1", "2");
        commandAddCard.execute(deckManager);
        Command commandDeleteCard = new DeleteCardCommand("MA1513", 0);
        assertFalse(commandDeleteCard.execute(deckManager));
        assertEquals(0, deckManager.getDeck("MA1513").getSize());
    }
}
