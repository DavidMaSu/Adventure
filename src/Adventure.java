import java.util.ArrayList;

public class Adventure {

    Room roomWest = new Room("Room West", "Des");
    Room roomNorthWest = new Room("Room North West", "Des");
    Room roomNorth = new Room("Room North", "Des");
    Room roomNorthEast = new Room("Room North East", "Des");
    Room roomEast = new Room("Room East", "Des");
    Room roomSouthEast = new Room("Room South East", "Des");
    Room roomSouth = new Room("Room South", "Des");
    Room roomSouthWest = new Room("Room South West", "Des");
    Room roomCentral = new Room("Room Central", "Des");

    Position player = new Position(roomNorthWest);
    Room currentRoom = roomNorthWest;

    //Initiates Games from Main
    public void startAdventure() {
        //Assigning Room Adjacencies format - (North, East, South, West)
        roomWest.setAdjacentRooms(roomNorthWest, null, roomSouthWest, null);
        roomNorthWest.setAdjacentRooms(null, roomNorth, roomWest, null);
        roomNorth.setAdjacentRooms(null, roomNorthEast, null, roomNorthWest);
        roomNorthEast.setAdjacentRooms(null, null, roomEast, roomNorth);
        roomEast.setAdjacentRooms(roomNorthEast, null, roomNorthEast, null);
        roomSouthEast.setAdjacentRooms(roomEast, null, null, roomSouth);
        roomSouth.setAdjacentRooms(roomCentral, roomSouthEast, null, roomSouthWest);
        roomSouthWest.setAdjacentRooms(roomWest, roomSouth, null, null);
        roomCentral.setAdjacentRooms(null, null, roomSouth, null);
        // END of assigning room Adjacencies

        IO.println("Test, East of " + roomNorth + " is " + roomNorth.getEast());

        boolean running = true;
        while (running) {

            String command = IO.readln("Input Command: ").trim().toLowerCase();

            //Takes input from room and position to change location or quit
            switch (command) {
                case "n" -> currentRoom = currentRoom.getNorth();
                case "s" -> currentRoom = currentRoom.getSouth();
                case "e" -> currentRoom = currentRoom.getEast();
                case "w" -> currentRoom = currentRoom.getWest();
                case "help" -> displayHelpMenu();
                case "exit" -> running = false;
                case "look" -> IO.println("You look and see that you are in " + currentRoom);
                default -> IO.println("Invalid Command");
            }

        }
        IO.println("Exiting Program");
    }

    private void displayHelpMenu() {
        IO.println("Type n to go North");
        IO.println("Type s to go South");
        IO.println("Type e to go East");
        IO.println("Type w to go West");
        IO.println("Type look to see room");
        IO.println("Type Exit to quit");
    }
}
