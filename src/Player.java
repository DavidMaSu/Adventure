public class Player {

    private Room currentRoom;

    public Player(Room firstroom) {
        this.currentRoom = firstroom;
    }

    public boolean moveNorth() {
        if (currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
            return true;
        } else {
            return false;
        }


    }

    public boolean moveSouth() {
        if (currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
            return true;
        } else {
            return false;
        }
    }

    public boolean moveEast() {
        if (currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
            return true;
        } else {
            return false;
        }

    }

    public boolean moveWest() {
        if (currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
            return true;
        } else {
            return false;
        }
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }
}