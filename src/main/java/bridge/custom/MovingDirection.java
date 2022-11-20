package bridge.custom;

public enum MovingDirection {
    U(1), D(0);

    private final int bridgeNumber;

    MovingDirection(int bridgeNumber) {
        this.bridgeNumber = bridgeNumber;
    }

    public static MovingDirection from(String movingDirection) {
        for (MovingDirection direction : MovingDirection.values()) {
            if (isSameDirectionName(movingDirection, direction)) {
                return direction;
            }
        }

        throw new IllegalArgumentException("예외처리");
    }

    private static boolean isSameDirectionName(String movingDirection, MovingDirection direction) {
        return direction.name().equals(movingDirection);
    }

    public static String get(int bridgeNumber) {
        if (isDownDirectionNumber(bridgeNumber)) {
            return D.name();
        }

        return U.name();
    }

    private static boolean isDownDirectionNumber(int bridgeNumber) {
        return bridgeNumber == 0;
    }
}
