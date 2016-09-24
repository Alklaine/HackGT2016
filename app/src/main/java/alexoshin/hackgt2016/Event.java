package alexoshin.hackgt2016;

import java.util.Date;
/**
 * Created by alexo on 9/24/2016.
 */
public class Event {
    private String name;
    private String loc;
    private Time startTime;
    private Time endTime;

    public Event(String name, String loc, Time startTime, Time endTime) {
        this.name = name;
        this.loc = loc;
        this.startTime = startTime;
        this.endTime = endTime;
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
    public Time getStartTime() {
        return startTime;
    }
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }
    public Time getEndTime() {
        return endTime;
    }
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
