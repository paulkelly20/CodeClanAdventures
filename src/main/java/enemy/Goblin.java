package enemy;

import item.Weapon;

public class Goblin extends Enemy {

    private Weapon weapon;

    public Goblin(String name, int healthPoints, Weapon weapon) {
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

