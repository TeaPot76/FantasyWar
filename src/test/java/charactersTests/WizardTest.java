package charactersTests;

import fantasywar.characters.magicians.Wizard;
import fantasywar.charactertools.Creature;
import fantasywar.charactertools.Spell;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {
    private Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Himan", 10, Spell.LIGHTNING, Creature.TROLL);

    }
    @Test
    public void hasName(){
        assertEquals("Himan", wizard.getName());

    }
    @Test
    public void hasSpell(){
        assertEquals(Spell.LIGHTNING, wizard.getSpell());

    }
    @Test
    public void hasCreature(){
        assertEquals(Creature.TROLL, wizard.getCreature());

    }
    @Test
    public void hasHealthLevel(){
        assertEquals(10, wizard.getHealthLevel());

    }
    @Test
    public void canSetName(){
        wizard.setName("Hercules");
        assertEquals("Hercules", wizard.getName());
    }

    @Test
    public void canSetSpell(){
        wizard.setSpell(Spell.ICESPIKE);
        assertEquals(Spell.ICESPIKE, wizard.getSpell());

    }
    @Test
    public void canSetCreature(){
        wizard.setCreature(Creature.DRAGON);
        assertEquals(Creature.DRAGON, wizard.getCreature());

    }

    @Test
    public void canSetHealthLevel(){
        wizard.setHealthLevel(15);
        assertEquals(15, wizard.getHealthLevel());

    }
}
