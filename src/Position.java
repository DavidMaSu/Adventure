import java.util.Random;

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
}

