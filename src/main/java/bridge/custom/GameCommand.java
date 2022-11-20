package bridge.custom;

public enum GameCommand {

    R("R"), Q("Q");

    private final String command;

    GameCommand(String command) {
        this.command = command;
    }

    public static GameCommand from(String gameCommand) {
        return null;
    }
}
