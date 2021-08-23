package Structural.Composite.Project;

import java.util.ArrayList;
import java.util.List;

public class Project extends AbstractItem implements ProjectContainer{
    private List<Item> items =new ArrayList<>();
    public Project(String name, double riskValue) {
        super(name, null,riskValue);
        this.isProject=true;
    }

    @Override
    public void add(Item item) {
        items.add(item);
        this.riskValue += item.calculateRisk();
    }

    @Override
    public void delete(Item item) {
        items.removeIf(p -> p== item);
    }

    @Override
    public void list() {
        for(Item p: items){
            System.out.println(p);
        }
    }

    @Override
    public double calculateRisk() {
        return this.riskValue;
    }
}
