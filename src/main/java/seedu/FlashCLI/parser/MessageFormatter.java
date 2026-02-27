package seedu.FlashCLI.parser;

public class MessageFormatter {

    protected String command;
    protected String argument;

    public MessageFormatter(String userInput) throws FlashException {
        if (userInput == null || userInput.trim().isEmpty()) {
            throw new FlashException("null input");
        }
        String[] words = userInput.split(" ", 2);
        command = words[0].toLowerCase();
        argument = words.length > 1 ? words[1] : "";
    }
}
