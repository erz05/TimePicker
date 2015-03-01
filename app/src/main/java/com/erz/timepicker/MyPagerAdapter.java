package com.erz.timepicker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by edgarramirez on 2/27/15.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {

    int[] layoutIDs = {R.layout.normal_clock, R.layout.color_clocks, R.layout.many_clocks};

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return MyFragment.newInstance(layoutIDs[position]);
    }

    @Override
    public int getCount() {
        return layoutIDs.length;
    }
}
