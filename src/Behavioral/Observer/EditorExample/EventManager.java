package Behavioral.Observer.EditorExample;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners=new HashMap<>();

    public EventManager (String ... operations){
        for(String operation:operations){
            this.listeners.put(operation,new ArrayList<>());
        }
    }

    public void subscribe(String eventType,EventListener eventListener){
        //hangi tip olan listeyse onu bulup ona üyeyi ekliyor
        List<EventListener> users=listeners.get(eventType);
        users.add(eventListener);
    }

    public void unsubscribe(String eventType,EventListener eventListener){
        List<EventListener> users=listeners.get(eventType);
        users.remove(eventListener);
    }

    public void notify(String eventType, File file){
        List<EventListener> users=listeners.get(eventType);
        for(EventListener listener:users){
            listener.update(eventType,file);
        }
    }



}
