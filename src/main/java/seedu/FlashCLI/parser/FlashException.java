package seedu.FlashCLI.parser;

public class FlashException extends Exception {

    public FlashException(String errorType) {
        super(getErrorMessage(errorType));
    }

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
