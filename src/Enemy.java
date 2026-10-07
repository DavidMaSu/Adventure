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

    public void takeDamage(int incomingValue) {
        health += incomingValue;
    }

    public boolean isDead() {
        return (health <= 0);
    }

    public void hit(Player player) {
        player.modifyHealth(weapon.getDamage());
    public void hit(int damage) {
        this.health -= damage;
    }

    public int getAttackDamage(){
        return this.weapon.getDamage();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public boolean isDead() {
        return this.health <= 0;
    }
    @Override
    public String toString() {
        return name + " " + description + " holding " + weapon + " " + health + "HP";
    }
}