package seedu.flashcli.command;

import org.junit.jupiter.api.Test;
import seedu.flashcli.deck.DeckManager;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateDeckCommandTest {
    @Test
    public void execute_validDeck_deckCreated() {
        DeckManager deckManager = new DeckManager();
        Command command = new CreateDeckCommand("MA1513");
        assertFalse(command.execute(deckManager));
        assertNotNull(deckManager.getDeck("MA1513"));
    }
}
