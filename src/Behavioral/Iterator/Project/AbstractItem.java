package Behavioral.Iterator.Project;

import java.util.Objects;

public abstract class AbstractItem implements Item {
    private String name;
    private Item item;
    protected double riskValue;
    boolean isProject;

    public AbstractItem(String name, Item item, double riskValue) {
        this.name = name;
        this.item = item;
        this.riskValue=riskValue;
        if(item !=null){
            ((Project) item).add(this);
        }
    }

    @Override
    public void begin() {
        System.out.println(name+ " project is begin");
    }

    @Override
    public void complete() {
        System.out.println(name + "project is completed");
    }

    @Override
    public double calculateRisk() {
        return this.riskValue;
    }

    @Override
    public String toString() {
        return "ProjectElement{" +
                "name='" + name + '\'' +
                ", project=" + item +
                ", riskValue=" + riskValue +
                ", isProject=" + isProject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractItem that = (AbstractItem) o;
        return Double.compare(that.riskValue, riskValue) == 0 && isProject == that.isProject && Objects.equals(name, that.name) && Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, item, riskValue, isProject);
    }
}
