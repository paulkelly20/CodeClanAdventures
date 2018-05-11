package item;

public class Treasure {

    private TreasureType treasureType;

    public Treasure(TreasureType treasureType) {
        this.treasureType = treasureType;
    }


    public TreasureType getTreasureType() {
        return treasureType;
    }
}

