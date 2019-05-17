package fantasywar.rooms;

public class Room {
    private String name;
    private Treasure treasure;

    public Room(String name, Treasure treasure) {
        this.name = name;
        this.treasure = treasure;
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
}
