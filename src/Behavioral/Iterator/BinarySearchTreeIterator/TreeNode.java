package Behavioral.Iterator.BinarySearchTreeIterator;

public class TreeNode<T extends Comparable<T>> {
    /**
     *This iterator assumes that the given binary search tree inserts nodes of smaller value to the left,
     * and nodes of larger value to the right of current node.
     */
    private final T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
        this.left=null;
        this.right=null;
    }

    public T getValue() {
        return value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public void insert(T valueToInsert){
        //önce soluna ya da sağına eklenebilecek en küçük dal bulunuyor.
        TreeNode<T> parent= getParentNodeOfValueToBeInserted (valueToInsert);
        //daha sonra bu noda veri ekleniyor.
        parent.insertNewChild(valueToInsert);
    }

    private void insertNewChild(T valueToInsert) {
        //eğer parent sayıdan küçükse sağa değilse sola eklenir.
        if(this.isLessThanOrEqualTo(valueToInsert)){
            System.out.println("sağa ekliyorum abi: "+valueToInsert);
            this.setRight(new TreeNode<>(valueToInsert));
        }else{
            System.out.println("sola ekliyorum abi : "+valueToInsert);
            this.setLeft(new TreeNode<>(valueToInsert));
        }
    }

    private boolean isLessThanOrEqualTo(T valueToInsert) {
        return this.value.compareTo(valueToInsert) < 1 ;
    }

    private TreeNode<T> getParentNodeOfValueToBeInserted(T valueToInsert) {
        TreeNode<T> parent=null;
        TreeNode<T> current = this;

        while(current!=null){
            parent=current;
            current=current.traverseOneLevelDown (valueToInsert);
        }

        return parent;
    }

    private TreeNode<T> traverseOneLevelDown(T valueToInsert) {
        if(this.isGreaterThen(valueToInsert)){
            return this.left;
        }
        return this.right;

    }

    private boolean isGreaterThen(T valueToInsert) {
        return this.value.compareTo(valueToInsert)>0;
    }
}
