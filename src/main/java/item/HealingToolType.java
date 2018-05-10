package item;

public enum HealingToolType {
    POTION(50),
    HERB(15),
    PARACETEMOL(30),
    IBUPROFEN(34),
    MORPHINE(100),
    SALINE(1);

    private int healingPower;

    HealingToolType(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
