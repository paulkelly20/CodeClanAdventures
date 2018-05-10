package mythicalCreature;


import interfaces.IAttack;
import interfaces.takeDamagable;

public abstract class MythicalCreature implements IAttack, takeDamagable{

    private String name;
    private int healthPoints;


    public MythicalCreature(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;

    }

    public String getName() {
        return name;
    }


    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }



}
