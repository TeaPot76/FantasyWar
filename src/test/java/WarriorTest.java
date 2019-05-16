import fantasywar.characters.Warrior;
import fantasywar.charactertools.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WarriorTest {
    private Warrior warrior;

    @Before
    public void before(){
        warrior = new Warrior("Himan", 100, Weapon.SPEAR);

    }
    @Test
    public void hasName(){
        assertEquals("Himan", warrior.getName());

    }
    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SPEAR, warrior.getWeapon());

    }
    @Test
    public void hasHealthLevel(){
        assertEquals(100, warrior.getHealthLevel());

    }
    @Test
    public void canSetName(){
        warrior.setName("Hercules");
        assertEquals("Hercules", warrior.getName());
    }

    @Test
    public void canSetWeapon(){
        warrior.setWeapon(Weapon.SPEAR);
        assertEquals(Weapon.SPEAR, warrior.getWeapon());

    }

    @Test
    public void canSetHealthLevel(){
        warrior.setHealthLevel(15);
        assertEquals(15, warrior.getHealthLevel());

    }
    @Test
    public void canAttack(){

        assertEquals(16, warrior.attack());
    }
    @Test
    public void canDefend(){

        assertEquals(104, warrior.defend());
    }
}

