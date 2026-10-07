public class Enemy {
    String name;
    String longName;
    String description;
    int health;
    Weapon weapon;

    public Enemy(String name, int health, String description, Weapon weapon) {
        this(name, name, description, health, weapon);
    }

    //tosting for hvad name has a weapon
    public Enemy(String name, String longName, String description, int health, Weapon weapon) {
        this.name = name;
        this.longName = longName;
        this.description = description;
        this.health = health;
        this.weapon = weapon;
    }

    public void TakeDamage(int incomingValue) {
        health += incomingValue;
    }

    public boolean isDead() {
        return (health <= 0);
    }

    public void hit(Player player) {
        player.modifyHealth(weapon.getDamage());
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}