public class MeleeWeapon extends Weapon {
    int damage;

    public MeleeWeapon(String name, String description, int damage) {
        super(name, description, damage);
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
