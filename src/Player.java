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

    public void removeItem(int index){
        inventory.remove(index);
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

    public boolean search(Item item){
        for(Item items : inventory){
            if(items == item)
                return true;
        }
        IO.println("Hello ");
        return false;
    }


}

//    public Item searchItem(Item selectedItem) {
//        Item itemFound = null;
//        for (Item item : inventory) {
//            if (inventory != null && item.equals(selectedItem)) {
//                itemFound = item.getItem();
//            }
//        }
//        return itemFound;
//    }
//}