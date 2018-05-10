package item;

public abstract class Healingtool{

    private int increaseHealth;
    private String healingToolTpye;

    public Healingtool(int increaseHealth, String healingToolTpye) {
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
