package item;

public enum WeaponType {
    SWORD(20),
    AXE(25),
    CLUB(15);

    private int attackPower;

    WeaponType(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }
}
