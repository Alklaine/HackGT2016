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
                CalendarTab tab1 = new CalendarTab();
                return tab1;
            case 1:
                ScheduleTab tab2 = new ScheduleTab();
                return tab2;
            case 2:
                AgendaTab tab3 = new AgendaTab();
                return tab3;
            case 3:
                SettingsTab tab4 = new SettingsTab();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
