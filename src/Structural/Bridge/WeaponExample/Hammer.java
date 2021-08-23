package Structural.Bridge.WeaponExample;

public class Hammer implements Weapon{
    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void swing() {
        System.out.println("this hammer is swinged..");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("this hammer is unwield");
        enchantment.onDeactivate();
    }

    @Override
    public void wield() {
        System.out.println("this hammer is wielded..");
        enchantment.onActivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
