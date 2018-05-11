package item;

public enum TreasureType {

    COIN(10),
    GEM(20),
    GOLD(50),
    DIAMOND(100),
    CAR(10);


    private int value;

    TreasureType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
