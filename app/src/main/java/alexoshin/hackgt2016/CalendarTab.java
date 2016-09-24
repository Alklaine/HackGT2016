package alexoshin.hackgt2016;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import alexoshin.hackgt2016.DatePickerController;
import alexoshin.hackgt2016.DayPickerView;
import alexoshin.hackgt2016.SimpleMonthAdapter;

/**
 * Created by alexo on 9/24/2016.
 */

public class CalendarTab extends Fragment implements alexoshin.hackgt2016.DatePickerController {
    private DayPickerView dayPickerView;

    public CalendarTab() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calendar_tab_fragment, container, false);
        DayPickerView dayPickerView = (DayPickerView) view.findViewById(R.id.pickerView);
        dayPickerView.setController(this);
        return view;
    }

    @Override
    public int getMaxYear()
    {
        return 2020;
    }

    @Override
    public void onDayOfMonthSelected(int year, int month, int day)
    {
        Log.e("Day Selected", day + " / " + month + " / " + year);
    }

    @Override
    public void onDateRangeSelected(SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays)
    {

        Log.e("Date range selected", selectedDays.getFirst().toString() + " --> " + selectedDays.getLast().toString());
    }
}
