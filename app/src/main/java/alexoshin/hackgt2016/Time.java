package alexoshin.hackgt2016;

import java.util.Date;
/**
 * Created by alexo on 9/24/2016.
 */

public class Time {
    private Date date;
    private int hour;
    private int min;
    public Time(Date date, int hour, int min) {
        this.date = date;
        this.hour = hour;
        this.min = min;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMin() {
        return min;
    }
    @Override
    public String toString() {
        return hour + ":" + min + " " + date;
    }
}
