package huhu.Entity;

import java.util.Date;

/**
 * Created by frank on 22.11.16.
 */
public class Event{

    private int id;
    private String heading;
    private String text;
    private String imagePath;
    private Date date;

    public Event(int id, String heading, String text, Date date, String imagePath) {
        this.id = id;
        this.heading = heading;
        this.imagePath = imagePath;
        this.text = text;
        this.date = date;
    }
    public Event(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
