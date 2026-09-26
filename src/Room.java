import java.util.ArrayList;
import java.util.Locale;

public class Room {
    private final String name;
    private final String description;
    private ArrayList<Item> inventory = new ArrayList<>();
    private Room north;
    private Room east;
    private Room south;
    private Room west;

    public Room(String name, String description){
        this.name = name;
        this.description = description;

    }
    //Start of room data Getters
    public String getName() {
        return name;
    }

    public String toString(){
        return getName();
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }
    //End of getters

    //Start of room direction setters

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setWest(Room west) {
        this.west = west;
    }
    //End of setters

    //Room inventory
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void addItem(Item itemNew){
        inventory.add(itemNew);
    }
    //Keeps track of room items in order to add them to player
    public Item removeItem(String name) {
        for (int i = 0; i < getInventory().size(); i++) {
            Item item = getInventory().get(i);
            if (item.toString().toLowerCase().contains(name.trim().toLowerCase())) {
                getInventory().remove(i);
                return item;
            }
        }
        return null;
    }


    // Initiate
    public void setAdjacentRooms(Room North, Room East, Room South, Room West) {
        setNorth(North);
        setEast(East);
        setSouth(South);
        setWest(West);
    }
}
