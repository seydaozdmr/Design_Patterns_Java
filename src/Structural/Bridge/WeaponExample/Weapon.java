package Structural.Bridge.WeaponExample;

public interface Weapon {
    void swing();
    void unwield();
    void wield();
    Enchantment getEnchantment();
}
