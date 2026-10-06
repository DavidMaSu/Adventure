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

    public void hit(int damage) {
        health -= damage;
        IO.println(name + "takes damage" + damage + "has health" + health);
        if (health >= 0) {
            IO.println("dead Enemy");
        }
    }
    public Enemy getName(){
        return getName();
    }
}