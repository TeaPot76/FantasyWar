package charactersTests;

import fantasywar.characters.warriors.Knight;
import fantasywar.charactertools.Weapon;
import org.junit.Before;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {
    private Knight knight;

    @Before
    public void before(){
        knight = new Knight("Himan", 10, Weapon.SPEAR);

    }
    @org.junit.Test
    public void hasName(){
        assertEquals("Himan", knight.getName());

    }
    @org.junit.Test
    public void hasWeapon(){
        assertEquals(Weapon.SPEAR, knight.getWeapon());

    }
    @org.junit.Test
    public void hasHealthLevel(){
        assertEquals(10, knight.getHealthLevel());

    }
    @org.junit.Test
    public void canSetName(){
        knight.setName("Hercules");
        assertEquals("Hercules", knight.getName());
    }

    @org.junit.Test
    public void canSetWeapon(){
        knight.setWeapon(Weapon.SPEAR);
        assertEquals(Weapon.SPEAR, knight.getWeapon());

    }

    @org.junit.Test
    public void canSetHealthLevel(){
        knight.setHealthLevel(15);
        assertEquals(15, knight.getHealthLevel());

    }
}
