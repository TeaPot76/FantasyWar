package fantasywar.charactertools;

public enum Creature {
    GOBLIN(10),
    TROLL(12),
    OGRE(14),
    DRAGON(16);



    private final int attackValue;

    Creature(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
