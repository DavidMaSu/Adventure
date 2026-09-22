import java.util.Random;

public class Position {
    private Room currentRoom;

    //Start position
    public Position(Room firstRoom) {
        this.currentRoom = firstRoom;
    }
    //Go to next room
    public boolean goToNextRoom(String direction) {
        Room nextRoom = currentRoom.(direction);
        if (nextRoom != null){
            currentRoom = nextRoom;
            return true;
        }
        return false;
    }
    //What room are we in?
    public int whereIsPlayer() {
        return currentRoom.getRoomNumber();
    }
}

