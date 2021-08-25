package Behavioral.Memento.Example;

import javax.persistence.criteria.CriteriaBuilder;

public class App {
    private static Originator originator;
    private static Memento memento;

    public static void main(String[] args) {
        originator=new Originator("state - 0");
        memento= originator.getMemento();

        OriginatorTrigger trigger=new OriginatorTrigger();
        trigger.start();

        CareTaker careTaker=new CareTaker(memento);
        careTaker.start();

    }

    static class OriginatorTrigger extends Thread{
        public void run(){
            for(int i=1;i <20 ;i++){
                String state="state-" + i;
                originator.setState(state);
                try{
                    sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
