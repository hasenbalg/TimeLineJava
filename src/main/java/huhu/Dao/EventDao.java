package huhu.Dao;

import huhu.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by frank on 22.11.16.
 */
@Repository
public class EventDao {
    @Autowired
    private static Map<Integer, Event> events;
    static {
        events = new HashMap<Integer, Event>(){
            {
                put(1, new Event(1, "heading 1", "text 1", new Date(12, 0, 16), "http://fillmurray.com/200/300"));
                put(2, new Event(2, "heading 2", "text 2", new Date(10, 0, 16), "http://fillmurray.com/g/200/300"));
                put(3, new Event(3, "heading 3", "text 1", new Date(90, 0, 16), "http://www.placecage.com/200/300"));
                put(4, new Event(4, "heading 4", "text 2", new Date(83, 0, 16), "http://www.placecage.com/g/200/300"));
                put(5, new Event(5, "heading 5", "text 1", new Date(89, 0, 16), "http://www.placecage.com/c/200/300"));
                put(6, new Event(6, "heading 6", "text 2", new Date(67, 0, 16), "http://www.placecage.com/gif/200/300"));
                put(7, new Event(7, "heading 7", "text 1", new Date(63, 0, 16), "http://fillmurray.com/g/200/300"));
                put(8, new Event(8, "heading 8", "text 2", new Date(50, 0, 16), "http://fillmurray.com/200/300"));

            }
        };
    }

    public Collection<Event> getAllEvents(){
        return this.events.values();
    }

    public Event getEventById(int id){
        return this.events.get(id);
    }

    public void removeEventById(int id) {
        this.events.remove(id);
    }

    public void updateEvent(Event event){
        Event e = events.get(event.getId());
        e.setHeading(event.getHeading());
        e.setText(event.getText());
        e.setDate(event.getDate());
        events.put(event.getId(), event);
    }

    public void addEvent(Event event) {
        this.events.put(event.getId(), event);
    }
}
