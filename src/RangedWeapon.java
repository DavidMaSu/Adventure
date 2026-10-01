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
        if (!canUse()){
            return 0;
        }

        remainingAmmo--;
        return damage;

    }

    public int getAmmoCount(){
        return remainingAmmo;
    }
}
