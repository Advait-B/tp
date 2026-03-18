package seedu.flashcli.command;

import seedu.flashcli.deck.Deck;

import java.util.Scanner;

import seedu.flashcli.deck.Card;
import seedu.flashcli.deck.DeckManager;
import seedu.flashcli.study.SessionManager;
import seedu.flashcli.ui.Ui;
import seedu.flashcli.exception.FlashException;

public class StudyCommand implements Command {
    private String deckName;

    public StudyCommand(String deckName) {
        this.deckName = deckName;
    }

    @Override
    public boolean execute(DeckManager deckManager, Ui ui, Scanner in) throws FlashException {
    Deck deck = deckManager.getDeck(deckName);
    if (deck.getSize() == 0) {
        System.out.println("Deck is empty. Add cards before studying.");
        return false;
    }
    SessionManager sessionManager = new SessionManager();
    sessionManager.startSession(deck);

    // Show the first question immediately
    Card first = sessionManager.getCurrentCard();
    System.out.println("Q: " + first.getQuestion());
    System.out.println("(Press Enter to reveal answer, or type 'q' to quit)");

    boolean showingAnswer = false; // false = next Enter shows answer, true = next Enter advances card

    String line;
    while (!(line = in.nextLine()).equals("q")) {
        if (!showingAnswer) {
            // Reveal answer for current card
            Card current = sessionManager.getCurrentCard();
            System.out.println("A: " + current.getAnswer());
            showingAnswer = true;
        } else {
            // Advance to next card
            boolean finished = sessionManager.nextCard();
            if (finished) {
                System.out.println("End of deck!");
                break;
            }
            Card next = sessionManager.getCurrentCard();
            System.out.println("Q: " + next.getQuestion());
            showingAnswer = false;
        }
    }
    int reviewed = sessionManager.finishSession();
    System.out.println("Session ended. Cards reviewed: " + reviewed);
    return false;
}
}