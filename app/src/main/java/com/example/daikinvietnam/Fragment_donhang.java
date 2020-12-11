package com.example.daikinvietnam;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.daikinvietnam.R;
import com.example.daikinvietnam.ViewPagerAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Fragment_donhang extends Fragment {
    private TabLayout tabLayout_314;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_donhang, container, false);
        tabLayout_314 =  (TabLayout) v.findViewById(R.id.tablayout_dh);
        appBarLayout = (AppBarLayout) v.findViewById(R.id.appbar_id);
        viewPager  = (ViewPager) v.findViewById(R.id.viewpager_dh);
        ViewPagerAdapter adapter = new ViewPagerAdapter (getChildFragmentManager(),tabLayout_314.getTabCount());
        //add Fragments
        adapter.AddFragment(new Fragment_donhang_dvkt(),"Dịch vụ kĩ thuật");
        adapter.AddFragment(new Fragment_donhang_phukien(),"Phụ kiện");
        //add Setup
        viewPager.setAdapter(adapter);
        tabLayout_314.setupWithViewPager(viewPager);
        return v;
    }
}
