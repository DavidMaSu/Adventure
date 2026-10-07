import java.util.ArrayList;

public class Player {

    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int health;
    private Weapon equippedWeapon = null;
    private Enemy enemy;


    public Player(Room firstroom) {
        this.currentRoom = firstroom;
        this.health = 100;
    }

    public void modifyHealth(int incomingValue) {
        health += incomingValue;
    }

    public int getHealth(){
        return health;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void addItem(Item itemNew) {
        inventory.add(itemNew);
    }

    //Keep track of player inventory in order to drop item
    public void removeItem(String name) {
        inventory.remove(searchItem(name));
    }

    public Item searchItem(String name) {
        for (int i = 0; i < getInventory().size(); i++) {
            Item item = getInventory().get(i);
            if (item.toString().toLowerCase().contains(name.trim().toLowerCase())) {
                return item;
            }
        }
        return null;
    }
    public boolean move(String direction) {
        Room nextRoom = switch (direction){
            case "n" -> currentRoom.getNorth();
            case "e" -> currentRoom.getEast();
            case "s" -> currentRoom.getSouth();
            case "w" -> currentRoom.getWest();
            default -> null;
        };
        if(null == nextRoom){
            return false;
        }
        currentRoom = nextRoom;
        return true;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public EatResult eat(String itemName) {
        Item inventoryItem = searchItem(itemName);
        Item roomItem = currentRoom.searchItem(itemName);
        if (inventoryItem == null && roomItem == null) {
            return EatResult.NOT_FOUND;
        }
        if (inventoryItem instanceof Food food) {
            modifyHealth(food.getHealthPoints());
            removeItem(itemName);
            return EatResult.EATEN;
        } else if (roomItem instanceof Food food) {
            modifyHealth(food.getHealthPoints());
            currentRoom.removeItem(itemName);
            return EatResult.EATEN;
        } else {
            return EatResult.NOT_FOOD;
        }
    }

    public DrinkResult drink(String itemName) {
        Item inventoryItem = searchItem(itemName);
        Item roomItem = currentRoom.searchItem(itemName);
        if (inventoryItem == null && roomItem == null) {
            return DrinkResult.NOT_FOUND;
        }
        if (inventoryItem instanceof Liquid liquid) {
            modifyHealth(liquid.getHealthPoints());
            removeItem(itemName);
            return DrinkResult.DRANK;
        } else if (roomItem instanceof Liquid liquid) {
            modifyHealth(liquid.getHealthPoints());
            currentRoom.removeItem(itemName);
            return DrinkResult.DRANK;
        } else {
            return DrinkResult.NOT_DRINKABLE;
        }
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public Equip equip(String weaponName){
        Item item = searchItem(weaponName);
        if (item instanceof Weapon){
            this.equippedWeapon = (Weapon) item;
            return Equip.EQUIP;
        } else if (item == null){
            return Equip.NOT_FOUND;
        } else {
            return Equip.CANNOT_EQUIP;
        }
    }
//    public Attack attack(){
//        int usesLeft = equippedWeapon.use();
//        if (equippedWeapon == null){
//            return Attack.CANNOT_ATTACK;
//        }
//        if (!equippedWeapon.canUse()){
//            return Attack.NO_AMMO;
//        }
//        if (equippedWeapon.canUse()){
//            return Attack.ATTACK;
//        } else {
//            return Attack.ATTACK;
//        }
//    }

    public Attack attack(){
        if (equippedWeapon == null){ //No weapon equipped
            return Attack.CANNOT_ATTACK;
        }
        if (!equippedWeapon.canUse()){
            return Attack.NO_AMMO;
        }
        else {
            int damage = equippedWeapon.getDamage();
            enemy.takeDamage(damage);
            equippedWeapon.use();
            return Attack.ATTACK;
        }
    }
    public void hit(int damage){
            this.health -= health;
    }
    public boolean isDead(){
        return this.health <= 0;
    }

    // This version of instance of is the short hand version, ian never explained this, but it is identical to the version below.

        public boolean isFood(Item item){
        if (item instanceof Food food) {
            modifyHealth(food.getHealthPoints());
            return true;
        } else { return false;
    }

//    public void isFood(Item item){
//        if (item instanceof Food) {
//            Food food = (Food) item;
//            modifyHealth(food.getHealthPoints());
//        }
//    }
    }
}

  
