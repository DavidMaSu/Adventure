import java.util.ArrayList;

public class Adventure {
    //Loads classes
    Player dovakin;

    public Adventure() {
        IO.println("Initializing Adventure");
        Map adventureMap = new Map();
        adventureMap.createMap();
        IO.println("Initializing Player");
        dovakin = new Player(adventureMap.getFirstRoom());
        IO.println("Player Inventory Size + Contents = " + dovakin.getInventory().size() + dovakin.getInventory() );

    }

    public boolean moveN() {
        if (dovakin.moveNorth()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean moveS() {
        if (dovakin.moveSouth()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean moveE() {
        if (dovakin.moveEast()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean moveW() {
        if (dovakin.moveWest()) {
            return true;
        } else {
            return false;
        }
    }

    public Room currentPos(){
        return dovakin.getCurrentRoom();
    }

    // Checks players current room if it has items in the inventory
    public boolean hasItems(){
        return !currentPos().getInventory().isEmpty();
    }

    public ArrayList<Item> displayItems(){
        return currentPos().getInventory();
    }

    public boolean playerHasItems(){
        return !dovakin.getInventory().isEmpty();
    }

    public ArrayList<Item> playerDisplayItems(){
        return dovakin.getInventory();
    }

    //Drops item from player
    public Item dropItem(String name){
        Item dropItem = dovakin.removeItem(name);
        if (dropItem != null){
            currentPos().addItem(dropItem);
        }
        return dropItem;
    }
    //Adds item to player
    public Item addItem(String name){
        Item foundItem = currentPos().removeItem(name);
        if (foundItem != null) {
            dovakin.addItem(foundItem);
        }
        return foundItem;
    }
}
