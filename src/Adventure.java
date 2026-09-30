import java.util.ArrayList;

public class Adventure {
    //Loads player
    Player dovakin;

    public Adventure(Room firstRoom) {
        dovakin = new Player(firstRoom);
            }

    public boolean playerMove(String direction) {
        return dovakin.move(direction);
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

    // Get Player Health
    public int displayPlayerHealth(){
        return dovakin.getHealth();
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
    // Tries to eat an item from player or room
    public EatResult playerEat(String itemName){
        return dovakin.eat(itemName);
    }
            ;

}
