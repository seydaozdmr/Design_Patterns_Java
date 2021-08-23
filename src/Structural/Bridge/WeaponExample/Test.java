package Structural.Bridge.WeaponExample;

public class Test {
    public static void main(String[] args) {
        Enchantment enchantment=new SoulEatingEnchantment();
        Sword enchantmentSword=new Sword(enchantment);

        enchantmentSword.swing();
        enchantmentSword.wield();
        enchantmentSword.unwield();
    }
}
