import java.util.ArrayList;
public class Map {

    private Room firstRoom;

    public void createMap() {

        IO.println("Creating Rooms");
        Room roomWest = new Room("Room West", "Des");
        Room roomNorthWest = new Room("Room North West", "Des");
        Room roomNorth = new Room("Room North", "Des");
        Room roomNorthEast = new Room("Room North East", "Des");
        Room roomEast = new Room("Room East", "Des");
        Room roomSouthEast = new Room("Room South East", "Des");
        Room roomSouth = new Room("Room South", "Des");
        Room roomSouthWest = new Room("Room South West", "Des");
        Room roomCentral = new Room("Room Central", "Des");

        IO.println("Setting Rooms");
        roomWest.setAdjacentRooms(roomNorthWest, null, roomSouthWest, null);
        roomNorthWest.setAdjacentRooms(null, roomNorth, roomWest, null);
        roomNorth.setAdjacentRooms(null, roomNorthEast, null, roomNorthWest);
        roomNorthEast.setAdjacentRooms(null, null, roomEast, roomNorth);
        roomEast.setAdjacentRooms(roomNorthEast, null, roomSouthEast, null);
        roomSouthEast.setAdjacentRooms(roomEast, null, null, roomSouth);
        roomSouth.setAdjacentRooms(roomCentral, roomSouthEast, null, roomSouthWest);
        roomSouthWest.setAdjacentRooms(roomWest, roomSouth, null, null);
        roomCentral.setAdjacentRooms(null, null, roomSouth, null);


        firstRoom = roomNorthWest;
        IO.println("Spawning in Room: " + firstRoom);

        Item sword = new Item("Sword","Magic!", 1);
        Item pot = new Item("Pot", "Infinite soup", 2);
        Item flashLight = new Item("Flashlight", "Never runs out of battery", 3);

        roomCentral.addItem(sword);
        roomNorthWest.addItem(pot);
        roomNorth.addItem(flashLight);

        IO.println("Initiating room inventories:");
        IO.println("Central Room: " + roomCentral.getInventory());
        IO.println("North West Room: " + roomNorthWest.getInventory());
        IO.println("North Room: " + roomNorth.getInventory());

    }

    public Room getFirstRoom (){
        return firstRoom;
    }
}
