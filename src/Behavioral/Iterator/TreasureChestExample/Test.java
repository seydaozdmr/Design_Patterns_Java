package Behavioral.Iterator.TreasureChestExample;

public class Test {
    public static void main(String[] args) {
        TreasureChest treasureChest=new TreasureChest();
        Iterator<Item> iterator=new TreasureChestItemIterator(treasureChest,ItemType.RING);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
