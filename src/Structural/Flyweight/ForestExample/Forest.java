package Structural.Flyweight.ForestExample;

import java.util.List;

public class Forest {
    private List<Tree> trees;
    private TreeFactory factory=new TreeFactory();
    public Tree plantTree(int x,int y, String name,String color,String texture){
        TreeType treeType=factory.getTreeType(name,color,texture);
        Tree tree=new Tree(x,y,treeType);
        return tree;
    }
}
