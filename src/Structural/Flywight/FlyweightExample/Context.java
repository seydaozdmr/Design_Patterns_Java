package Structural.Flywight.FlyweightExample;

public class Context {
    private String color;
    private String sprite;

    private int vector;
    private int coords;
    private int speed;

    private Particle particle;
    ParticleFactory particleFactory;

    public Context(String color, String sprite, int vector, int coords, int speed) {
        particleFactory=new ParticleFactory();
        particle=particleFactory.getParticle(color,sprite);


        this.vector = vector;
        this.coords = coords;
        this.speed = speed;
    }

    public Particle operation(){
        return particle.operation(vector,coords,speed);
    }

}
