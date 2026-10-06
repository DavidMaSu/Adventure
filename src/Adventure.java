import java.util.ArrayList;

public class Adventure {
    //Loads player
    Player dovakin;
    Enemy enemy;

    public Adventure(Room firstRoom) {
        dovakin = new Player(firstRoom);
    }

    public Equip playerEquip(String name) {
        return dovakin.equip(name);
    }

    public Attack playerAttack(Enemy targetEnemy) {
        return dovakin.attack(targetEnemy);
    }

    public Weapon getWeapon() {
        return dovakin.getEquippedWeapon();
    }

    public boolean playerMove(String direction) {
        return dovakin.move(direction);
    }

    public Room currentPos() {
        return dovakin.getCurrentRoom();
    }

    // Checks players current room if it has items in the inventory
    public boolean hasItems() {
        return !currentPos().getInventory().isEmpty();
    }

    public ArrayList<Item> displayItems() {
        return currentPos().getInventory();
    }

    public boolean playerHasItems() {
        return !dovakin.getInventory().isEmpty();
    }

    public ArrayList<Item> playerDisplayItems() {
        return dovakin.getInventory();
    }

    // Get Player Health
    public int displayPlayerHealth() {
        return dovakin.getHealth();
    }

    //Drops item from player
    public boolean dropItem(String name) {
        Item dropItem = dovakin.searchItem(name);
        if (dropItem != null) {
            currentPos().addItem(dropItem);
            dovakin.removeItem(name);
            return true;
        } else {
            return false;
        }
    }
    //Adds item to player

    public boolean playerTakeItemFromRoom(String name) {
        Item foundItem = currentPos().removeItem(name);
        if (foundItem != null) {
            dovakin.addItem(foundItem);
            return true;
        } else {
            return false;
        }
    }

    // Tries to eat an item from player or room
    public EatResult playerEat(String itemName) {
        return dovakin.eat(itemName);
    }

    public DrinkResult playerDrink(String itemName) {
        return dovakin.drink(itemName);
    }

    public boolean isPlayerDead() {
        return dovakin.isDead();
    }

    public boolean isEnemyDead() {
        return enemy.isDead();
    }

    public Enemy findEnemyInRoom(String enemyName) {
        return currentPos().searchEnemy(enemyName);
    }

    public ArrayList<Enemy> displayEnemies() {
        return currentPos().getEnemies();
    }

    public boolean hasEnemies() {
        return !currentPos().getEnemies().isEmpty();
    }

    public void playerTakeDamage(int damage){
        this.dovakin.hit(damage);
    }

}
