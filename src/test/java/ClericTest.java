import fantasywar.characters.Cleric;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {
    private Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Gandalf", 100);

    }
    @Test
    public void hasName(){
        assertEquals("Gandalf", cleric.getName());

    }

    @Test
    public void hasMedcine(){
        assertEquals(100, cleric.getMedicine());

    }
    @Test
    public void canSetName(){
        cleric.setName("Sorcerio");
        assertEquals("Sorcerio", cleric.getName());
    }




    @Test
    public void canSetHealthLevel(){
        cleric.setMedicine(150);
        assertEquals(150, cleric.getMedicine());

    }
}
