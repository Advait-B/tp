package seedu.FlashCLI.parser;

public class MessageFormatter {

    private static final String[] VALID_COMMANDS = {
            "addCard", "listCards", "deleteCard",
            "createDeck", "listDecks", "clearDeck",
            "study", "nextCard", "finish",
            "exit", "help"
    };

    protected String command;
    protected String arguments;

    public MessageFormatter(String userInput) throws FlashException {
        validateInput(userInput);
        String[] words = userInput.split(" ", 2);
        command = words[0].trim();
        arguments = words.length > 1 ? words[1] : "";
        validateCommand();
        executeCommand();
    }

    private void validateInput(String userInput) throws FlashException {
        if (userInput == null || userInput.trim().isEmpty()) {
            throw new FlashException("null input");
        }
    }

    private void validateCommand() throws FlashException {
        for (String valid : VALID_COMMANDS) {
            if (valid.equals(command)) {
                return;
            }
        }
        throw new FlashException("invalid command");
    }

    public void executeCommand() throws FlashException {
        switch (command) {
        case "addCard":
            break;
        case "listCards":
            break;
        case "deleteCard":
            break;
        case "createDeck":
            break;
        case "listDecks":
            break;
        case "clearDeck":
            break;
        case "study":
            break;
        case "nextCard":
            break;
        case "finish":
            break;
        case "exit":
            break;
        case "help":
            break;
        default:
            throw new FlashException("invalid command");
        }
    }
}
