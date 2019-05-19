package fantasywar.charactertools;

public enum Creature {
    GOBLIN(2),
    TROLL(2),
    OGRE(4),
    DRAGON(6);



    private final int attackValue;

    Creature(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
