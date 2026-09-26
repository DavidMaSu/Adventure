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

    public boolean search(Item item){
        IO.println("Item in inventory " + dovakin.getInventory());
        IO.println("Looking for this item " + item);
        return dovakin.search(item);
    }



//    public Item searchItem(Item taskenHunLederEfter) {
//        Item itemFound = null;
//        for (dovakin.getInventory() item : dovakin.getInventory()) {
//            if (dovakin.getInventory() != null && sæde.getTaske().equals(taskenHunLederEfter)) {
//                itemFound = sæde.getItem();
//            }
//        }
//        return fundetTaske;
//    }
//
//    public int hvilketNrSædeErTaskenFundetPå(Taske taskenHunLederEfter){
//        int sædeHvorTaskenLigger = -1;
//        for (int i = 0; i < sæder.size(); i++) {
//            if (sæder.get(i).getTaske() != null && sæder.get(i).getTaske().equals(taskenHunLederEfter)) {
//                sædeHvorTaskenLigger = i + 1;
//            }
//        }
//        return sædeHvorTaskenLigger;
//    }
}
