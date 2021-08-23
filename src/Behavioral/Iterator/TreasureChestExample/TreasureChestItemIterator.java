package Behavioral.Iterator.TreasureChestExample;

import java.util.List;

public class TreasureChestItemIterator implements Iterator<Item> {
    private final TreasureChest treasureChest;
    private int idx;
    private final ItemType itemType;

    public TreasureChestItemIterator(TreasureChest treasureChest, ItemType itemType) {
        this.treasureChest = treasureChest;
        this.itemType = itemType;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        idx= findNextIdx();
        if(idx!=-1){
            return treasureChest.getItemList().get(idx);
        }
        return null;
    }

    private int findNextIdx() {
        List<Item> itemList=treasureChest.getItemList();
        int tempIdx=idx;
        while(true){
            tempIdx++;
            if(tempIdx>=itemList.size()){
                tempIdx=-1;
                break;
            }

            if(itemType.equals(ItemType.ANY) || itemList.get(tempIdx).getType().equals(itemType)){
                break;
            }
        }
        return tempIdx;
    }
}
