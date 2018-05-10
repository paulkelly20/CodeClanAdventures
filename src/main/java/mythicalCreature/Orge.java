package mythicalCreature;

import item.Weapon;

public class Orge extends MythicalCreature {

    private Weapon weapon;

    public Orge(String name, int healthPoints, Weapon weapon) {
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
