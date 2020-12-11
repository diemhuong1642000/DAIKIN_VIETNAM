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

public class Fragment_thongbao extends Fragment {
    private TabLayout tabLayout_314;
    private AppBarLayout appBarLayout_314;
    private ViewPager viewPager_314;
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_thongbao, container, false);
        tabLayout_314 =  (TabLayout) v.findViewById(R.id.tablayout_id);
        appBarLayout_314 = (AppBarLayout) v.findViewById(R.id.appbar_id);
        viewPager_314  = (ViewPager) v.findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter (getChildFragmentManager(),tabLayout_314.getTabCount());
        //add Fragments
        adapter.AddFragment(new Fragment_thongbao_cv(),"Công việc");
        adapter.AddFragment(new Fragment_thongbao_tt(),"Tin tức");
        //add Setup
        viewPager_314.setAdapter(adapter);
        tabLayout_314.setupWithViewPager(viewPager_314);
        return v;
    }
}

