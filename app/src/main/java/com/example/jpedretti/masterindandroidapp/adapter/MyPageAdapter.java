package com.example.jpedretti.masterindandroidapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.jpedretti.masterindandroidapp.fragments.ContactFragment;
import com.example.jpedretti.masterindandroidapp.fragments.ListFragment;
import com.example.jpedretti.masterindandroidapp.fragments.SettingsFragment;

/**
 * Created by jpedretti on 03/11/2016.
 */

public class MyPageAdapter extends FragmentPagerAdapter {

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment result = null;
        switch (position) {
            case 0:
                result = new ListFragment();
                break;
            case 1:
                result = new ContactFragment();
                break;
            case 2:
                result = new SettingsFragment();
                break;
        }

        return result;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence result = null;
        switch (position) {
            case 0:
                result = "LIST";
                break;
            case 1:
                result = "CONTACT";
                break;
            case 2:
                result = "SETTINGS";
                break;
        }

        return result;
    }
}
