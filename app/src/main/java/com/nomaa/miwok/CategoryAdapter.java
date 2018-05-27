package com.nomaa.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nomaa on 6/6/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter{
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return "Numbers";
        else
            return "Family";
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyMembersFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
