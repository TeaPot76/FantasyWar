package charactersTests;

import fantasywar.characters.warriors.Dwarf;
import fantasywar.charactertools.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {
    private Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Himan", 10, Weapon.SPEAR);

    }
    @Test
    public void hasName(){
        assertEquals("Himan", dwarf.getName());

    }
    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SPEAR, dwarf.getWeapon());

    }
    @Test
    public void hasHealthLevel(){
        assertEquals(10, dwarf.getHealthLevel());

    }
    @Test
    public void canSetName(){
        dwarf.setName("Hercules");
        assertEquals("Hercules", dwarf.getName());
    }

    @Test
    public void canSetWeapon(){
        dwarf.setWeapon(Weapon.SPEAR);
        assertEquals(Weapon.SPEAR, dwarf.getWeapon());

    }

    @Test
    public void canSetHealthLevel(){
        dwarf.setHealthLevel(15);
        assertEquals(15, dwarf.getHealthLevel());

    }
}
