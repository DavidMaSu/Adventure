public class RangedWeapon extends Weapon {
    private int damage;
    private int remainingAmmo;
    public RangedWeapon (String name, String description, int damage, int ammo){
        super(name, description);
        this.damage = damage;
        this.remainingAmmo = ammo;

    }

    @Override
    public boolean canUse() {
        return (remainingAmmo > 0);
    }

    @Override
    public int use() {
        return damage;
    }
}
