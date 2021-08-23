package Structural.Bridge.JPAExample;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class JPAConcrete implements JpaRepository<User, Integer> {
    private JPABridge bridge=new JPABridge();

    @Override
    public List<User> findAll() {
        return bridge.findAll();
    }

    @Override
    public List<User> findAllById(Iterable<Integer> iterable) {
        return bridge.findAllById(iterable);
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> iterable) {
        return bridge.saveAll(iterable);
    }


    @Override
    public User getById(Integer integer) {
        return bridge.getById(integer);
    }
}
