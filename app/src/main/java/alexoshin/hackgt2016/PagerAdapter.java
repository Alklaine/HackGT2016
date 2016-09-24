package alexoshin.hackgt2016;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by alexo on 9/24/2016.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                System.out.println("calendar");
                return new CalendarTab();
            case 1:
                System.out.println("schedule");
                return new ScheduleTab();
            case 2:
                System.out.println("agenda");
                return new AgendaTab();
            case 3:
                System.out.println("settings");
                return new SettingsTab();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
