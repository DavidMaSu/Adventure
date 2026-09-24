public class Map {
    Room roomWest = new Room("Room West", "Des");
    Room roomNorthWest = new Room("Room North West", "Des");
    Room roomNorth = new Room("Room North", "Des");
    Room roomNorthEast = new Room("Room North East", "Des");
    Room roomEast = new Room("Room East", "Des");
    Room roomSouthEast = new Room("Room South East", "Des");
    Room roomSouth = new Room("Room South", "Des");
    Room roomSouthWest = new Room("Room South West", "Des");
    Room roomCentral = new Room("Room Central", "Des");

    public void createMap() {
        roomWest.setAdjacentRooms(roomNorthWest, null, roomSouthWest, null);
        roomNorthWest.setAdjacentRooms(null, roomNorth, roomWest, null);
        roomNorth.setAdjacentRooms(null, roomNorthEast, null, roomNorthWest);
        roomNorthEast.setAdjacentRooms(null, null, roomEast, roomNorth);
        roomEast.setAdjacentRooms(roomNorthEast, null, roomSouthEast, null);
        roomSouthEast.setAdjacentRooms(roomEast, null, null, roomSouth);
        roomSouth.setAdjacentRooms(roomCentral, roomSouthEast, null, roomSouthWest);
        roomSouthWest.setAdjacentRooms(roomWest, roomSouth, null, null);
        roomCentral.setAdjacentRooms(null, null, roomSouth, null);
    }
}
