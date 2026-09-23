import java.util.ArrayList;

public class Position {
    private Room currentRoom;

    //Start position
    public Position(Room firstRoom) {
        this.currentRoom = firstRoom;
    }
    //Go to next room
    public boolean movement(String direction) {
        switch (direction){
            case "n" -> {
                Room nextRoom = currentRoom.getNorth();
                if (nextRoom != null){
                    IO.println("You go north");
                }
            }
            case "s" -> {
                Room nextRoom = currentRoom.getSouth();
                if (nextRoom != null) {
                    IO.println("You go South");
                }
            }
            case "e" -> {
                Room nextRoom = currentRoom.getEast();
                if (nextRoom != null) {
                    IO.println("You go East");
                }
            }
            case "w" -> {
                Room nextRoom = currentRoom.getWest();
                if (nextRoom != null) {
                    IO.println("You go West");
                }
            }
            default -> IO.println("Invalid Command");
        }
        return false;
    }

    //What room are we in?
    public Room whereIsPlayer() {
        return currentRoom.getName();
    }


    //Print rooms
    private void makeRooms(){
    Room room1 = new Room("North West", "des");
    Room room2 = new Room("North", "des");
    Room room3 = new Room("North East", "des");
    Room room4 = new Room("West", "des");
    Room room5 = new Room("Central", "des");
    Room room6 = new Room("East", "des");
    Room room7 = new Room("South West", "des");
    Room room8 = new Room("South", "des");
    Room room9 = new Room("South East", "des");

    room1.setAdjacentRooms(null, room2, room4, null);
    room2.setAdjacentRooms(null, room3, room5, room1);
    room3.setAdjacentRooms(null, null, room6, room2);
    room4.setAdjacentRooms(room1, null, room7, null);
    room5.setAdjacentRooms(null, null, room8, null);
    room6.setAdjacentRooms(room3, null, room9, null);
    room7.setAdjacentRooms(room4, room8, null, null);
    room8.setAdjacentRooms(room5, room9, null, room7);
    room9.setAdjacentRooms(room6, null, null, room8);


    }
}

