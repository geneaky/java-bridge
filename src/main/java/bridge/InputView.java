package bridge;

import bridge.custom.ClientConsole;
import bridge.custom.GameCommand;
import bridge.custom.MovingDirection;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    private final ClientConsole console;

    public InputView(ClientConsole console) {
        this.console = console;
    }

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return console.typeBridgeSize();
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public MovingDirection readMoving() {
        return console.typeMovingDirection();
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public GameCommand readGameCommand() {
        return console.typeGameCommand();
    }
}
