package alexoshin.hackgt2016;

import java.util.Date;
/**
 * Created by alexo on 9/24/2016.
 */
public class Event {
    private String name;
    private String loc;
    private Time time;

    public Event(String name, String loc, Time time) {
        this.name = name;
        this.loc = loc;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return loc;
    }
    public void setLocation(String loc) {
        this.loc = loc;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public Date getDate() {
        return time.getDate();
    }
    public void setDate(Date date) {
        time.setDate(date);
    }
    public int getHour() {
        return time.getHour();
    }
    public void setHour(int hour) {
        time.setHour(hour);
    }
    public int getMin() {
        return time.getMin();
    }
    public void setMin(int min) {
        time.setMin(min);
    }
}
