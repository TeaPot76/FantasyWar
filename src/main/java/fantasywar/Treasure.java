package fantasywar;

public enum Treasure {
    GOLD(10),
    SILVER(8),
    RUBY(12),
    FROGS(30);



    private final int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}