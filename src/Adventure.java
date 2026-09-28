import java.util.ArrayList;

public class Adventure {
    //Loads player
    Player dovakin;

    public Adventure(Room firstRoom) {
        dovakin = new Player(firstRoom);
            }

    public boolean playerMoveN() {
        return dovakin.moveNorth();
    }

    public boolean playerMoveS() {
        return dovakin.moveSouth();
    }

    public boolean playerMoveE() {
        return dovakin.moveEast();
    }

    public boolean playerMoveW() {
        return dovakin.moveWest();
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
