package seedu.flashcli.parser;

public class AddCardArgs {

    private final String deckName;
    private final String question;
    private final String answer;

    public AddCardArgs(String deckName, String question, String answer) {
        this.deckName = deckName;
        this.question = question;
        this.answer   = answer;
    }

    public String getDeckName() {
        return deckName;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
