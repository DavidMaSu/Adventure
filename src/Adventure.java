import java.util.ArrayList;

public class Adventure {
    //Loads classes
    Player dovakin;

    public Adventure(Item test) {
        Map adventureMap = new Map();
        adventureMap.createMap();
        dovakin = new Player(adventureMap.getFirstRoom());
        this.test = test;
        dovakin.addItem(test);

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
