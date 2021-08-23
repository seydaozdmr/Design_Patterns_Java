package Structural.Bridge.WeaponExample;

public class FlyingEnchantment implements Enchantment{
    @Override
    public void apply() {
        System.out.println("this item is flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void onActivate() {
        System.out.println("this item begins to glow faintly..");
    }

    @Override
    public void onDeactivate() {
        System.out.println("this item's glow fades.");
    }
}
