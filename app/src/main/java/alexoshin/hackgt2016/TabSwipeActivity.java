package alexoshin.hackgt2016;

import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.PagerAdapter;
import android.widget.TableLayout;

import java.util.ArrayList;


/**
 * Created by alexo on 9/24/2016.
 */

public class TabSwipeActivity extends FragmentActivity {
    private static final int NUM_TABS = 4;
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    private ArrayList<Fragment> tabs;
    private TabLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new TabSwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        table = (TabLayout) findViewById(R.id.tab_layout);
//        table.addTab(new CalendarTab());
//        table.addTab(new ScheduleTab());
//        table.addTab(new AgendaTab());
//        table.addTab(new SettingsTab());

        ((TabSwipeAdapter) pagerAdapter).addItem(new CalendarTab());
        ((TabSwipeAdapter) pagerAdapter).addItem(new ScheduleTab());
        ((TabSwipeAdapter) pagerAdapter).addItem(new AgendaTab());
        ((TabSwipeAdapter) pagerAdapter).addItem(new SettingsTab());

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(table));
        table.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager) {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                //tabLayout
                //adapter.getItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    private class TabSwipeAdapter extends FragmentStatePagerAdapter {
        private ArrayList<Fragment> fragments;
        public TabSwipeAdapter(FragmentManager fm) {
            super(fm);
        }


        public void addItem(Fragment frag) {
            fragments.add(frag);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return NUM_TABS;
        }
    }
}
