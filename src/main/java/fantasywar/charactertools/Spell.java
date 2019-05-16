package fantasywar.charactertools;

public enum Spell {
    FIREBOLT (10),
    LIGHTNING(12),
    FROSTRUNE(14),
    ICESPIKE(16);



    private final int attackValue;

    Spell(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
