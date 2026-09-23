import java.util.ArrayList;

public class Room {
    private final String name;
    private final String description;
    private ArrayList<Room> adjacentRooms = new ArrayList<>();
    private Room north;
    private Room east;
    private Room south;
    private Room west;

    public Room(String name, String description){
        this.name = name;
        this.description = description;

    }
    //Start of Getters
    public String getName() {
        return name;
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

    //Start of setters

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
    public ArrayList<Room> getAdjacentRooms() {
        return adjacentRooms;
    }

    public String toString(){
        return getName();
    }

    public void setAdjacentRooms(Room North, Room East, Room South, Room West) {
        adjacentRooms.add(North);
        setNorth(North);
        adjacentRooms.add(East);
        setEast(East);
        adjacentRooms.add(South);
        setSouth(South);
        adjacentRooms.add(West);
        setWest(West);
    }
}
