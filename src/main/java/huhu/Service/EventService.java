package huhu.Service;


import huhu.Dao.EventDao;
import huhu.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by frank on 22.11.16.
 */
@Service
public class EventService {
    @Autowired
    private EventDao eventDao;
    public Collection<Event> getAllEvents(){
        Collection<Event> eventList = this.eventDao.getAllEvents();

        return this.eventDao.getAllEvents();
    }

    public Event getEventById(int id){
        return this.eventDao.getEventById(id);
    }

    public void removeEventById(int id) {
        this.eventDao.removeEventById(id);
    }

    public void updateEvent(Event event){
        this.eventDao.updateEvent(event);
    }

    public void addEvent(Event event) {
        this.eventDao.addEvent(event);
    }
}