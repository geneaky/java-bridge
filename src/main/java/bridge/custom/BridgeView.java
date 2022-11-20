package bridge.custom;

public enum BridgeView {

    PREFIX_BRIDGE("["), MIDDLE_BRIDGE("|"), SUBFIX_BRIDGE("]");

    private final String bridgeShape;

    BridgeView(String bridgeShape) {
        this.bridgeShape = bridgeShape;
    }
}
