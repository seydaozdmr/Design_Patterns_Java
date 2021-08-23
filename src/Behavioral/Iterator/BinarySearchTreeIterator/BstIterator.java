package Behavioral.Iterator.BinarySearchTreeIterator;

import Behavioral.Iterator.TreasureChestExample.Iterator;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class BstIterator<T extends Comparable<T>> implements Iterator<TreeNode<T>> {
    private final ArrayDeque<TreeNode<T>> pathStack;

    public BstIterator(TreeNode<T> root){
        pathStack=new ArrayDeque<>();
        pushPathToNextSmallest(root);
    }

    private void pushPathToNextSmallest(TreeNode<T> root) {
        while(root !=null){
            pathStack.push(root);
            root=root.getLeft();
        }
    }


    @Override
    public boolean hasNext() {
        return !pathStack.isEmpty();
    }

    @Override
    public TreeNode<T> next() {
        if(pathStack.isEmpty()){
            throw new NoSuchElementException();
        }

        TreeNode<T> next=pathStack.pop();
        pushPathToNextSmallest(next.getRight());
        return next;
    }
}
