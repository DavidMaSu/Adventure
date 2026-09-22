import java.util.Random;

public class Position {
    private Room currentRoom;

    //Start position
    public Position(Room firstRoom) {
        this.currentRoom = firstRoom;
    }
    //Go to next room
    public boolean movement(String direction) {
        switch (movement(direction)){
            case "n" -> {
                Room nextRoom = currentRoom.getName;
                if (nextRoom != null){
                    this.currentRoom = currentRoom.north;
                }
            }
            case "s" -> IO.println("You go South");
            case "e" -> IO.println("You go East");
            case "w" -> IO.println("You go West");
            default -> IO.println("Invalid Command");
        }
        return false;
    }
    //What room are we in?
    public Room whereIsPlayer() {
        return currentRoom.getName();
    }
}

