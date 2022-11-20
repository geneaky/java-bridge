package bridge;

import bridge.custom.BridgeConsole;
import bridge.custom.BridgeGameRunner;

public class Application {

    public static void main(String[] args) {
        BridgeGameRunner bridgeGameRunner = new BridgeGameRunner(new InputView(new BridgeConsole()),
            new OutputView());
        bridgeGameRunner.run();
    }
}
