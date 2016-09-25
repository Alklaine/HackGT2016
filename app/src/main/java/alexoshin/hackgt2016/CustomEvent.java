package alexoshin.hackgt2016;

import java.util.Date;
/**
 * Created by alexo on 9/24/2016.
 */
public class CustomEvent {
    private String name;
    private String summary = "";
    private String description = "";
    private String loc;
    private Time startTime;
    private Time endTime;
    private boolean allDay = false;

    //CustomEvent class, local storage Object of Google's Event Object, for local/non-google usage. Name, location, start and end time
    public CustomEvent(String name, String loc, Time startTime, Time endTime) {
        this.name = name;
        this.loc = loc;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    //CustomEvent class, Name, location, summary and description, time assumed to be all day;
    ////ALWAYS check if allDay is true first before start/end times to avoid null encounters.
    public CustomEvent(String name, String loc, String summary, String description) {
        this.name = name;
        this.loc = loc;
        this.summary = summary;
        this.description = description;
        this.allDay = true;
    }

    //Full CustomEvent object, not assumed all day
    public CustomEvent(String name, String loc, String summary, String description, Time startTime, Time endTime) {
        this.name = name;
        this.loc = loc;
        this.summary = summary;
        this.description = description;
        this.startTime =startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
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
    public Time getEndTime() {
        return endTime;
    }
    public void setStartAndEndTime(Time startTime, Time endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.allDay = false;
    }
    //ALWAYS check if allDay is true first before start/end times to avoid null encounters.
    public void changeToAllDay() {
        this.startTime = null;
        this.endTime = null;
        this.allDay = true;
    }
    //ALWAYS check if allDay is true first before start/end times to avoid null encounters.
    public boolean isAllDay() {
        return allDay;
    }
}
