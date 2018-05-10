package item;

public class Healingtool extends Item{

    private int increaseHealth;
    private String healingToolTpye;

    public Healingtool(String name, int increaseHealth, String healingToolTpye) {
        super(name);
        this.increaseHealth = increaseHealth;
        this.healingToolTpye = healingToolTpye;
    }

    public int getIncreaseHealth() {
        return increaseHealth;
    }

    public String getHealingToolTpye() {
        return healingToolTpye;
    }
}
