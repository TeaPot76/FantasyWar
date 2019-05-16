package fantasywar.characters;

import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;

public class Magician extends Character{

    private Spell spell;
    private Creature creature;


    public Magician(String name, int healthLevel, Spell spell, Creature creature) {
        super(name, healthLevel);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return spell;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
