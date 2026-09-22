import java.util.Random;

public class Position {
    private Room currentRoom;

    //Start position
    public Position(Room firstRoom) {
        this.currentRoom = firstRoom;
    }
    //Go to next room
    public boolean goToNextRoom() {
        currentRoom = currentRoom.getRoom();
        return currentRoom != null;
    }
    //What room are we in?
    public int whereIsPlayer() {
        return currentRoom.getRoomNumber();
    }
}

