package Structural.Bridge.JPAExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class JPABridge {
    private Map<Integer,User> myMap=new HashMap<>();

    public List<User> findAll(){
        return (List) myMap.values();
    }

    public User getById(Integer id){
        return myMap.get(id);
    }

    public List<User> findAllById(Iterable<Integer> ids){
        List<User> result=new ArrayList<>();
        for(int elem:ids){
            if(myMap.containsKey(elem)){
                result.add(myMap.get(elem));
            }
        }
        return result;
    }

    public <S extends User> List <S> saveAll(Iterable<S> iterable){
        List<S> elems=new ArrayList<>();
        for(S in:iterable){
            if(!myMap.containsKey(in.getId())){
                myMap.put(in.getId(),in);
                elems.add(in);
            }
        }
        return elems;
    }



}
