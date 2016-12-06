package huhu.Controller;

import huhu.Entity.Event;
import huhu.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
/**
 * Created by frank on 22.11.16.
 */
@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Event> getAllEvents(){
        return this.eventService.getAllEvents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Event getEventById(@PathVariable("id") int id){
        return this.eventService.getEventById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEvent(@PathVariable("id") int id){
        eventService.removeEventById(id);
    }

    @RequestMapping( method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateEvent(@RequestBody Event event){
        eventService.updateEvent(event);
    }

    @RequestMapping( method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }


}
