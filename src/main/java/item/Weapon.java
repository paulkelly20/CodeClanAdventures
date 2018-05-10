package item;

import java.util.WeakHashMap;

public class Weapon {

    private WeaponType weaponType;


    public Weapon(WeaponType weaponType) {

        this.weaponType = weaponType;

    }

    public int getDamagePoints() {
        return weaponType.getAttackPower();
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
