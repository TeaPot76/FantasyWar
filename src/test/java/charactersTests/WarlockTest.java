package charactersTests;

import fantasywar.characters.magicians.Warlock;
import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {
    private Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Himan", 10, Spell.LIGHTNING, Creature.TROLL);

    }
    @Test
    public void hasName(){
        assertEquals("Himan", warlock.getName());

    }
    @Test
    public void hasSpell(){
        assertEquals(Spell.LIGHTNING, warlock.getSpell());

    }
    @Test
    public void hasCreature(){
        assertEquals(Creature.TROLL, warlock.getCreature());

    }
    @Test
    public void hasHealthLevel(){
        assertEquals(10, warlock.getHealthLevel());

    }
    @Test
    public void canSetName(){
        warlock.setName("Hercules");
        assertEquals("Hercules", warlock.getName());
    }

    @Test
    public void canSetSpell(){
        warlock.setSpell(Spell.ICESPIKE);
        assertEquals(Spell.ICESPIKE, warlock.getSpell());

    }
    @Test
    public void canSetCreature(){
        warlock.setCreature(Creature.DRAGON);
        assertEquals(Creature.DRAGON, warlock.getCreature());

    }

    @Test
    public void canSetHealthLevel(){
        warlock.setHealthLevel(15);
        assertEquals(15, warlock.getHealthLevel());

    }
}
