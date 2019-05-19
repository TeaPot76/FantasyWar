package fantasywar.rooms;

import fantasywar.Player;
import fantasywar.interfaces.IRoom;

import java.util.HashMap;
import java.util.Map;

public class Room implements IRoom {
    private String name;
    private Treasure treasure;
    private Map<String, Player> players;

    public Room(String name, Treasure treasure) {
        this.name = name;
        this.treasure = treasure;
        this.players = new HashMap<>();
    }

    public Room(String name, Treasure treasure, Map<String, Player> players) {
        this.name = name;
        this.treasure = treasure;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public void setPlayers(Map<String, Player> players) {
        this.players = players;
    }

    public void addPlayerToRoom(String name, Player player){
        players.put(name, player);
    }

    public Map<String, Player> getPlayers(){
        return players;
    }

    public Player getPlayerByName(String name){
        return players.get(name);
    }


}
