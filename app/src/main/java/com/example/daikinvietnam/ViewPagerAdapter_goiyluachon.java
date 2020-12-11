package com.example.daikinvietnam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter_goiyluachon extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList_314 = new ArrayList<>();
    private final List<String> fragmentListTitles_314 = new ArrayList<>();

    public ViewPagerAdapter_goiyluachon(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList_314.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitles_314.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles_314.get(position);
    }

    public void AddFragment (Fragment fragment, String title) {
        fragmentList_314.add(fragment);
        fragmentListTitles_314.add(title);
    }
}