package gameTests;

import fantasywar.rooms.Room;
import fantasywar.rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {
    private Room room;

    @Before
    public void before(){
        room = new Room("DarkRoom", Treasure.FROGS);

    }
    @Test
    public void hasName(){
        assertEquals("DarkRoom", room.getName());
    }

    @Test
    public void hasTreasure(){
        assertEquals(Treasure.FROGS, room.getTreasure());

    }
    @Test
    public void canSetName(){
        room.setName("Cellar");
        assertEquals("Cellar", room.getName());
    }

    @Test
    public void canSetSpell(){
        room.setTreasure(Treasure.RUBY);
        assertEquals(Treasure.RUBY, room.getTreasure());

    }



}
