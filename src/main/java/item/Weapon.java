package item;

public abstract class Weapon {

    private int damagePoints;
    private String weaponType;

    public Weapon(int damagePoints, String weaponType) {

        this.damagePoints = damagePoints;
        this.weaponType = weaponType;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public String getwaeponType() {
        return weaponType;
    }
}
