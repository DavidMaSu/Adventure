import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();

    public Player(Room firstroom) {
        this.currentRoom = firstroom;
    }

    public ArrayList<Item> getInventory(){
        return inventory;
    }

    public void addItem(Item itemNew){
        inventory.add(itemNew);
    }
    //Keep track of player inventory in order to drop item
    public Item removeItem(String name){
        for (int i = 0; i < getInventory().size(); i++) {
            Item item = getInventory().get(i);
            if (item.toString().toLowerCase().contains(name.trim().toLowerCase())) {
                getInventory().remove(i);
                return item;
            }
        }
        return null;
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