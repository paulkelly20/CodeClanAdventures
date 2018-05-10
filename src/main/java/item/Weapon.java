package item;

public class Weapon extends Item {

    private int damagePoints;
    private String weaponType;

    public Weapon(String name, int damagePoints, String weaponType) {
        super(name);
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
