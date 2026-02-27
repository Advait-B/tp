package seedu.FlashCLI.parser;

public class FlashException extends Exception {
    public FlashException(String errorType) {
        super(getErrorMessage(errorType));
    }
    private static String getErrorMessage(String errorType) {
        if (errorType == null || errorType.isEmpty()) {
            return "No command entered. Use \"help\" to see available commands.";
        }
        switch (errorType) {
        case "null input":
            return "Please type in a command or use \"help\" to see the list of commands.";
        default:
            return "Invalid command format. Use \"help\" to see the list of all commands.";
        }
    }
}
