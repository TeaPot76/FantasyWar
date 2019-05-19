package gameTests;

import fantasywar.Player;
import fantasywar.rooms.Room;
import fantasywar.rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {
    private Room room;
    private Player player1;
    private Player player2;
    private Player player3;
    private Map<String, Player> players;


    @Before
    public void before(){
        player1 = new Player("Edwin");
        player2 = new Player("Lidia");
        player3 = new Player("Axel");
        players = new HashMap<>();
        players.put(player1.getName(), player1);
        players.put(player2.getName(), player2);
        players.put(player3.getName(), player3);
        room = new Room("DarkRoom", Treasure.FROGS, players);

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
    public void canSetTreasure(){
        room.setTreasure(Treasure.RUBY);
        assertEquals(Treasure.RUBY, room.getTreasure());

    }

    @Test
    public void hasPlayers(){
        assertEquals(players, room.getPlayers());
    }

    @Test
    public void setPlayers(){
        room = new Room("Dungeon", Treasure.RUBY);
        room.setPlayers(players);
        assertEquals(players, room.getPlayers());
    }
    @Test
    public void getPlayerByName(){
        assertEquals(player1, room.getPlayerByName("Edwin"));
    }

    @Test
    public void addPlayer(){
        // setup
        Map<String, Player> expectedPlayers = new HashMap<>();
        expectedPlayers.put(player1.getName(), player1);
        room = new Room("DeavilsHell", Treasure.FROGS);
        // test
        room.addPlayerToRoom("Edwin", player1);
        // check
        assertEquals(player1, room.getPlayerByName("Edwin"));
        assertEquals(expectedPlayers, room.getPlayers());
    }

}
