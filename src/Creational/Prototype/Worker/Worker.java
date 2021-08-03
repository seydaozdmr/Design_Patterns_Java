package Creational.Prototype.Worker;

public class Worker implements Prototype{
    boolean partTime;

    public Worker(Worker worker) {
        this.partTime = worker.partTime;
    }

    public Worker(){

    }

    @Override
    public Prototype clone() {
        return new Worker(this);
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "partTime=" + partTime +
                '}';
    }
}
