package seedu.flashcli.command;

import seedu.flashcli.deck.DeckManager;
import seedu.flashcli.ui.Ui;

public class CreateDeckCommand implements Command {
    private String deckName;

    public CreateDeckCommand(String deckName) {
        this.deckName = deckName;
    }

    /**
     * Creates a deck.
     *
     * @param deckManager Represents the current deckManager state.
     * @param ui Prints out message that deck was created.
     * @return false, indicating the program should not terminate after executing this object.
     */
    @Override
    public boolean execute(DeckManager deckManager, Ui ui) {
        deckManager.createDeck(deckName);
        ui.showDeckCreated(deckName);
        return false;
    }
}
