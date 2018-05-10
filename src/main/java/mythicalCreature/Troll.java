package mythicalCreature;

import item.Weapon;

public class Troll extends MythicalCreature {


    private Weapon weapon;

    public Troll(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public int getAttackPower() {
        return weapon.getDamagePoints();
    }

}
