import java.util.ArrayList;
public class Map {


    //Egentlig kunne man godt bare have dette som metode men
    public Room createMap() {

        Room roomWest = new Room("Room West", "Des");
        Room roomNorthWest = new Room("Room North West", "Des");
        Room roomNorth = new Room("Room North", "Des");
        Room roomNorthEast = new Room("Room North East", "Des");
        Room roomEast = new Room("Room East", "Des");
        Room roomSouthEast = new Room("Room South East", "Des");
        Room roomSouth = new Room("Room South", "Des");
        Room roomSouthWest = new Room("Room South West", "Des");
        Room roomCentral = new Room("Room Central", "Des");


        roomWest.     setAdjacentRooms(roomNorthWest, null,          roomSouthWest, null);
        roomNorthWest.setAdjacentRooms(null,          roomNorth,     roomWest,      null);
        roomNorth.    setAdjacentRooms(null,          roomNorthEast, null,          roomNorthWest);
        roomNorthEast.setAdjacentRooms(null,          null,          roomEast,      roomNorth);
        roomEast.     setAdjacentRooms(roomNorthEast, null,          roomSouthEast, null);
        roomSouthEast.setAdjacentRooms(roomEast,      null,          null,          roomSouth);
        roomSouth.    setAdjacentRooms(roomCentral,   roomSouthEast, null,          roomSouthWest);
        roomSouthWest.setAdjacentRooms(roomWest,      roomSouth,     null,          null);
        roomCentral.  setAdjacentRooms(null,          null,          roomSouth,     null);


        Room firstRoom = roomNorthWest;

        Item sword = new Item("Sword","Magic!");
        Item pot = new Item("Pot", "Infinite storage!");
        Item flashLight = new Item("Flashlight", "Never runs out of battery!");

        Food bread = new Food("Bread", "A loaf of stale bread", 10);
        Food goldenCarrot = new Food("Golden Carrot", "Carrot covered in gold", 90);
        Food suspiciousStew = new Food("Suspicious stew", "A stew that smells amazing", -50);

        Liquid water = new Liquid("Water", "Nice cold water", 10);
        Liquid swampWater = new Liquid("Swamp water", "Suspicious looking water", -20);
        Liquid cocaCola = new Liquid("Coca Cola", "A glass bottle of coca cola", 40);

        roomNorthWest.addItem(sword);
        roomNorthWest.addItem(pot);
        roomNorth.addItem(flashLight);

        roomCentral.addItem(bread);
        roomNorthWest.addItem(goldenCarrot);
        roomNorth.addItem(suspiciousStew);

        roomCentral.addItem(water);
        roomNorthWest.addItem(swampWater);
        roomNorth.addItem(cocaCola);

        return firstRoom;
    }
}
