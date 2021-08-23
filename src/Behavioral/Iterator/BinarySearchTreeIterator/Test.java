package Behavioral.Iterator.BinarySearchTreeIterator;

public class Test {
    public static void main(String[] args) {
        TreeNode<Integer> root=buildIntegerBst();
        BstIterator<Integer> iterator=new BstIterator<>(root);

        while(iterator.hasNext()){
            System.out.println(iterator.next().getValue());
        }
    }

    private static TreeNode<Integer> buildIntegerBst(){
        TreeNode<Integer> root=new TreeNode<>(8);
        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);

        return root;
    }
}
