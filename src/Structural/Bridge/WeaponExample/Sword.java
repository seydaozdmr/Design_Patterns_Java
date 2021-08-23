package Structural.Bridge.WeaponExample;



public class Sword implements Weapon{
    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void swing() {
        System.out.println("this sword is swinged..");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("this sword is enwielded..");
        enchantment.onDeactivate();
    }

    @Override
    public void wield() {
        System.out.println("this sword is wielded");
        enchantment.onActivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return this.enchantment;
    }


}
