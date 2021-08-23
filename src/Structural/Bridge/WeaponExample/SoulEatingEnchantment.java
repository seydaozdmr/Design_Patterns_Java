package Structural.Bridge.WeaponExample;

public class SoulEatingEnchantment implements Enchantment{
    @Override
    public void apply() {
        System.out.println("this item spreads bloodlust");
    }

    @Override
    public void onActivate() {
        System.out.println("the item eats the soul of enemies");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Bloodlust slowly disappears");
    }
}
