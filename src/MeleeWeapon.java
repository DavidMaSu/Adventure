public class MeleeWeapon extends Weapon {
    int damage;

    public MeleeWeapon(String name, String description, int damage,boolean droppable) {
        super(name, description, damage, droppable);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public boolean canUse() {
        return true;
    }

    @Override
    public int use(){
        return damage;
    }
}
