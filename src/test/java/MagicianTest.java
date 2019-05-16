import fantasywar.characters.Magician;
import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MagicianTest {
    private Magician magician;

    @Before
    public void before(){
        magician = new Magician("Himan", 110, Spell.LIGHTNING, Creature.TROLL);

    }
    @Test
    public void hasName(){
        assertEquals("Himan", magician.getName());

    }
    @Test
    public void hasSpell(){
        assertEquals(Spell.LIGHTNING, magician.getSpell());

    }
    @Test
    public void hasCreature(){
        assertEquals(Creature.TROLL, magician.getCreature());

    }
    @Test
    public void hasHealthLevel(){
        assertEquals(110, magician.getHealthLevel());

    }
    @Test
    public void canSetName(){
        magician.setName("Hercules");
        assertEquals("Hercules", magician.getName());
    }

    @Test
    public void canSetSpell(){
        magician.setSpell(Spell.ICESPIKE);
        assertEquals(Spell.ICESPIKE, magician.getSpell());

    }
    @Test
    public void canSetCreature(){
        magician.setCreature(Creature.DRAGON);
        assertEquals(Creature.DRAGON, magician.getCreature());

    }

    @Test
    public void canSetHealthLevel(){
        magician.setHealthLevel(15);
        assertEquals(15, magician.getHealthLevel());
    }
    @Test
    public void canAttack(){

        assertEquals(12, magician.attack());
    }
    @Test
    public void canDefend(){

        assertEquals(113, magician.defend());
    }
}
