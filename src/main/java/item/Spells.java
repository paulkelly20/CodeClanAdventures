package item;


import com.sun.tools.javac.code.Symtab;

public class Spells extends Item {

    private int damagePoints;
    private String spellType;

    public Spells(String name, int damagePoints, String spellType) {
        super(name);
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
