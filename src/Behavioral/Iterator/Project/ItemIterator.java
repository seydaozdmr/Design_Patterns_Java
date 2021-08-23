package Behavioral.Iterator.Project;

import java.util.List;

public class ItemIterator implements Iterator<Item>{
    private Project project;
    private int idx;

    public ItemIterator(Project project) {
        this.project = project;
        this.idx=-1;
    }

    @Override
    public boolean hasNext() {
        return getIdx()!=-1;
    }

    @Override
    public Item next() {
        idx=getIdx();
        if(idx!=-1){
            return project.getItems().get(idx);
        }
        return null;
    }

    private int getIdx(){
        List<Item> projectList= project.getItems();
        int tempIdx=idx;
        while(true){
            tempIdx++;
            //System.out.println(tempIdx);
            if(tempIdx>=projectList.size()){
                tempIdx=-1;
                break;
            }
            if(projectList.get(tempIdx)!=null){
                break;
            }
        }
        return tempIdx;
    }
}
