import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int health;


    public Player(Room firstroom) {
        this.currentRoom = firstroom;
        this.health = 100;
    }

    public String modifyHealth(Food food) {
         health += food.getHealthPoints();
             return "current heath " + health;
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

    public boolean move(String move) {

        boolean running = true;

        //Takes input from room and position to change location or quit
        switch (move) {
            case "n" -> {
                if (currentRoom.getNorth() != null) {
                    currentRoom = currentRoom.getNorth();
                    return true;
                } else {
                    return false;
                }
            }
            case "e" -> {
                if (currentRoom.getEast() != null) {
                    currentRoom = currentRoom.getEast();
                    return true;
                } else {
                    return false;
                }
            }
            case "s" -> {
                if (currentRoom.getSouth() != null) {
                    currentRoom = currentRoom.getSouth();
                    return true;
                } else {
                    return false;
                }
            }
            case "w" -> {
                if (currentRoom.getWest() != null) {
                    currentRoom = currentRoom.getWest();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return running;
    }
    public Room getCurrentRoom(){
        return currentRoom;
    }

  
