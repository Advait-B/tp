package seedu.flashcli.command;

import org.junit.jupiter.api.Test;
import seedu.flashcli.deck.DeckManager;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExitCommandTest {
    @Test
    public void execute_exitCommand_returnsTrue() {
        DeckManager deckManager = new DeckManager();
        Command command = new ExitCommand();
        assertTrue(command.execute(deckManager));
    }
}
