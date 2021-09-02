package Structural.Flyweight.FlyweightExample;

import java.util.ArrayList;
import java.util.List;

public class ParticleFactory {
    private List<Particle> particles;

    public ParticleFactory() {
        this.particles = new ArrayList<>();
    }

    public Particle getParticle(String color, String sprite){
        Particle particle=null;
        for(Particle p:particles){
            if(p.getColor().equals(color) && p.getSprite().equals(sprite)){
                particle=p;
            }
        }
        int sira=0;
        if(particle==null){
            sira=particles.size();
            particles.add(new Particle(color,sprite));
            particle=particles.get(sira);
        }
        System.out.println(particle);
        return particle;
    }
}
