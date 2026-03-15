package seedu.flashcli.parser;

public class DeckArgs {

    private final String deckName;

    public DeckArgs(String deckName) {
        this.deckName = deckName;
    }

    public String getDeckName() {
        return deckName;
    }
}
