package Structural.Flywight.FlyweightExample;

public class Test {
    public static void main(String[] args) {
        Context context=new Context("kirmizi","s",100,150,200);
        Particle particle=context.operation();
        Particle particle1=context.operation();


        if(particle==particle1){
            System.out.println("ikisi aynı nesne");
        }
    }
}
