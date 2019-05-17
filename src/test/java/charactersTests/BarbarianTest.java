package charactersTests;

import fantasywar.characters.warriors.Barbarian;
import fantasywar.charactertools.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {
    private Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Himan", 10, Weapon.SPEAR);

    }
    @Test
    public void hasName(){
        assertEquals("Himan", barbarian.getName());

    }
    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SPEAR, barbarian.getWeapon());

    }
    @Test
    public void hasHealthLevel(){
        assertEquals(10, barbarian.getHealthLevel());

    }
    @Test
    public void canSetName(){
        barbarian.setName("Hercules");
        assertEquals("Hercules", barbarian.getName());
    }

    @Test
    public void canSetWeapon(){
        barbarian.setWeapon(Weapon.SPEAR);
        assertEquals(Weapon.SPEAR, barbarian.getWeapon());

    }

    @Test
    public void canSetHealthLevel(){
        barbarian.setHealthLevel(15);
        assertEquals(15, barbarian.getHealthLevel());

    }
}
