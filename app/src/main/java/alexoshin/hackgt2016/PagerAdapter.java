package alexoshin.hackgt2016;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

/**
 * Created by alexo on 9/24/2016.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    //Activity activityObj;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    //private class A extends AppCompatActivity {
      //  public ActionBar actionbar = getSupportActionBar();

        //private A() {}
   // }

    @Override
    public Fragment getItem(int position) {

        //Toolbar toolbar = (Toolbar) toolbar.findViewById();
//        A Abar = new A();
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
  //              Abar.actionbar.setTitle("Settings");
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
