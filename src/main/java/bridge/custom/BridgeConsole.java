package bridge.custom;

import camp.nextstep.edu.missionutils.Console;

public class BridgeConsole implements ClientConsole {

    @Override
    public int typeBridgeSize() {
        String bridgeSize = Console.readLine();
        return Integer.parseInt(bridgeSize);
    }

    @Override
    public MovingDirection typeMovingDirection() {
        String movingDirection = Console.readLine();
        return MovingDirection.from(movingDirection);
    }

    @Override
    public GameCommand typeGameCommand() {
        String gameCommand = Console.readLine();
        return GameCommand.from(gameCommand);
    }
}
