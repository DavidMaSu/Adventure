public class RangedWeapon extends Weapon {
    private int remainingAmmo;


    public RangedWeapon (String name, String description, int damage, int ammo, boolean droppable){
        super(name, description, damage, droppable);
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
        return getDamage();

    }

    public int getAmmoCount(){
        return remainingAmmo;
    }
}
