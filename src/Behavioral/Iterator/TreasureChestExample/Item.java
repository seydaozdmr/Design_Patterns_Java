package Behavioral.Iterator.TreasureChestExample;

public class Item {
    private final String name;
    private ItemType type;

    public Item( ItemType type , String name) {
        this.name = name;
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
