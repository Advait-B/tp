package seedu.FlashCLI.parser;

/**
 * Parses and validates user input.
 * Dispatches execution if the command is valid.
 */
public class MessageFormatter {

    // Array of all recognized commands accepted by the application.
    private static final String[] VALID_COMMANDS = {
            "addCard", "listCards", "deleteCard",
            "createDeck", "listDecks", "clearDeck",
            "study", "nextCard", "finish",
            "exit", "help"
    };

    protected String command;
    protected String arguments;

    /**
     * The input is split into its command and arguments.
     * The command is then validated and executed.
     *
     * @param userInput the raw input string entered by the user
     * @throws FlashException if the input is null or blank, or if the command is not valid
     */
    public MessageFormatter(String userInput) throws FlashException {
        validateInput(userInput);
        String[] words = userInput.split(" ", 2);
        command = words[0].trim();
        arguments = words.length > 1 ? words[1] : "";
        validateCommand(command);
        executeCommand(command, arguments);
    }

    /**
     * Validates that the user input is not blank.
     *
     * @param userInput the raw input string to validate
     * @throws FlashException if userInput is null or contains only whitespace
     */
    private void validateInput(String userInput) throws FlashException {
        if (userInput == null || userInput.trim().isEmpty()) {
            throw new FlashException("null input");
        }
    }

    /**
     * Validates that the command matches one of the entries in VALID_COMMANDS.
     *
     * @param command the command to validate
     * @throws FlashException if the command is not found in the list of valid commands
     */
    private void validateCommand(String command) throws FlashException {
        for (String valid : VALID_COMMANDS) {
            if (valid.equals(command)) {
                return;
            }
        }
        throw new FlashException("invalid command");
    }

    /**
     * Executes the appropriate command.
     */
    public void executeCommand(String command, String arguments) throws FlashException {
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
