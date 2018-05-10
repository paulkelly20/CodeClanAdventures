package item;


public abstract class Spells {

    private int damagePoints;
    private String spellType;

    public Spells(int damagePoints, String spellType) {

        this.damagePoints = damagePoints;
        this.spellType = spellType;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public String getSpellType() {
        return spellType;
    }
}
