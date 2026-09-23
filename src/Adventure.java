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

    Room currentRoom = roomNorthWest;

    //Initiates Games from Main
    public void startAdventure() {
        //Assigning Room Adjacencies format - (North, East, South, West)
        roomWest.setAdjacentRooms(roomNorthWest, null, roomSouthWest, null);
        roomNorthWest.setAdjacentRooms(null, roomNorth, roomWest, null);
        roomNorth.setAdjacentRooms(null, roomNorthEast, null, roomNorthWest);
        roomNorthEast.setAdjacentRooms(null, null, roomEast, roomNorth);
        roomEast.setAdjacentRooms(roomNorthEast, null, roomSouthEast, null);
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
                case "n" -> {
                    if (currentRoom.getNorth() != null) {
                        currentRoom = currentRoom.getNorth();
                        IO.println("You move North");
                    } else {
                        invalidMove();
                    }
                }

                case "s" -> {
                    if (currentRoom.getSouth() != null) {
                        currentRoom = currentRoom.getSouth();
                        IO.println("You move South");
                    } else {
                        invalidMove();
                    }
                }
                case "e" -> {
                    if (currentRoom.getEast() != null) {
                        currentRoom = currentRoom.getEast();
                        IO.println("You move East");
                    } else {
                        invalidMove();
                    }
                }
                case "w" -> {
                    if (currentRoom.getWest() != null) {
                        currentRoom = currentRoom.getWest();
                        IO.println("You move West");
                    } else {
                        invalidMove();
                    }
                }
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

    private void invalidMove() {
        IO.println("You cannot move in this direction");
    }
}
