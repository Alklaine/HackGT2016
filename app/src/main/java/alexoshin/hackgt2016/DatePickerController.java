package alexoshin.hackgt2016;

/**
 * Created by alexo on 9/24/2016.
 */

public interface DatePickerController {
    public abstract int getMaxYear();

    public abstract void onDayOfMonthSelected(int year, int month, int day);

    public abstract void onDateRangeSelected(final SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays);

}