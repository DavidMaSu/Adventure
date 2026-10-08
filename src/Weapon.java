public abstract class Weapon extends Item{
    private int damage;
    private boolean droppable;

    public Weapon(String name, String description, int damage, Boolean droppable) {
        super(name, description);
        this.damage = damage;
        this.droppable = droppable;
    }

    public int getDamage() {
        return damage;
    }

    public boolean canDrop (){
        return droppable;
    }

    public abstract boolean canUse();
    public abstract int use();
}
