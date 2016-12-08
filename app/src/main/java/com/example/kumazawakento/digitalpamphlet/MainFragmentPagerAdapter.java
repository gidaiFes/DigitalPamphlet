package com.example.kumazawakento.digitalpamphlet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {
    public MainFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MainPageFragment();
            case 1:
                return new TabFragmentMap();
            case 2:
                return new TabFragmentTime();
            case 3:
                return new TabFragmentFood();
            case 4:
                return new TabFragmentEvent();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        final String[] pageTitle = {"HOME", "MAP", "TIME TABLE", "FOODS","EVENT"};

        return pageTitle[position];
    }
}