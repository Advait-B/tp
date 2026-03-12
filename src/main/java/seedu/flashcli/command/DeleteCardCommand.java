package seedu.flashcli.command;

import seedu.flashcli.deck.Deck;
import seedu.flashcli.deck.DeckManager;

public class DeleteCardCommand implements Command {
    private String deckName;
    private int cardIndex;
    public DeleteCardCommand(String deckName, int cardIndex) {
        this.deckName = deckName;
        this.cardIndex = cardIndex;
    }
    @Override
    public boolean execute(DeckManager deckManager) {
        Deck deck = deckManager.getDeck(deckName);
        if (deck == null) {
            return false;
        }
        deck.deleteCard(cardIndex);
        return false;
    }
}
