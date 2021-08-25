package Behavioral.Memento.Example;

public class CareTaker extends Thread{
    private Memento memento;

    public CareTaker(Memento memento){
        this.memento=memento;
    }
    @Override
    public void run() {
        for (int i=0;i<11;i++){
            if(i!=0 && i %5 ==0){
                memento.undo();
            }else {
                memento.save();
            }
            try{
                sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
