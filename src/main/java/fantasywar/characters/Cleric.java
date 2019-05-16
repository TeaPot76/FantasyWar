package fantasywar.characters;

public class Cleric {
    private String name;
    private int medicine;

    public Cleric(String name, int medicine) {
        this.name = name;
        this.medicine = medicine;
    }

    public String getName() {
        return name;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }
}
