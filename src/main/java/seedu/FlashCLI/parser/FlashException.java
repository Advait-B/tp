package seedu.FlashCLI.parser;

/**
 * Represents application-specific exceptions thrown by FlashCLI.
 */
public class FlashException extends Exception {

    public FlashException(String errorType) {
        super(getErrorMessage(errorType));
    }

    /**
     * Maps an error type key to a user-facing error message.
     *
     * @param errorType the error type key to look up
     * @return a user-friendly error message string
     */
    private static String getErrorMessage(String errorType) {
        switch (errorType) {
        case "null input":
            return "Please type in a command or use \"help\" to see the list of commands.";
        case "invalid command":
            return "Invalid command format. Use \"help\" to see the list of all commands.";
        default:
            return "Use \"help\" to see the list of all commands.";
        }
    }
}
