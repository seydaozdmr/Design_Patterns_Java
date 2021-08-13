package Structural.Flywight.ForestExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeFactory {
    private List<TreeType> treeTypes;

    public TreeFactory() {
        this.treeTypes=new ArrayList<>();
    }

    public TreeType getTreeType(String name,String color,String texture){
        TreeType treeType=null;
        for(TreeType t:treeTypes){
            if(t.getName().equals(name) && t.getColor().equals(color) && t.getTexture().equals(texture)){
                treeType=t;
            }
        }
        int sira=0;
        if(treeType==null){
            sira=treeTypes.size();
            treeTypes.add(new TreeType(name,color,texture));
            treeType=treeTypes.get(sira);
        }
        return treeType;
    }
}
