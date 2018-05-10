package item;

public enum SpellType {
    FIREBALL(20),
    ICEBOLT(16),
    THUNDER(25),;

    private int attackPower;
    SpellType(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }


}
