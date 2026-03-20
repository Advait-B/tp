package seedu.flashcli.command;

import java.util.Scanner;

import seedu.flashcli.deck.DeckManager;
import seedu.flashcli.ui.Ui;

public class ExitCommand implements Command {
    /**
     * Tells the program to terminate after executing this object.
     *
     * @param deckManager Represents the current deckManager state.
     * @param ui Prints out the bye message.
     * @return true, indicating the program should terminate after executing this object.
     */
    @Override
    public boolean execute(DeckManager deckManager, Ui ui, Scanner in) {
        ui.bye();
        return true;
    }
}
