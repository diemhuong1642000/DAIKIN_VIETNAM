package com.example.daikinvietnam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daikinvietnam.R;
import com.example.daikinvietnam.ViewPagerAdapter_goiyluachon;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class GoiYLuaChonActivity extends AppCompatActivity {
    TabLayout tabLayout_314;
    AppBarLayout appBarLayout_314;
    ViewPager viewPager_314;
    ImageView goiy_314;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goi_y_lua_chon);

        goiy_314 = (ImageView) findViewById(R.id.gylchon);
        tabLayout_314 = (TabLayout) findViewById(R.id.tablayout_id_314);
        appBarLayout_314 = (AppBarLayout) findViewById(R.id.appbar_314);
        viewPager_314 = (ViewPager) findViewById(R.id.viewpager_id_314) ;
        ViewPagerAdapter_goiyluachon adapter_314 = new ViewPagerAdapter_goiyluachon(getSupportFragmentManager());
        adapter_314.AddFragment(new Goiyluachon_Thietbi(),"Thiết Bị");
        adapter_314.AddFragment(new Goiyluachon_Dichvu(),"Dịch Vụ");
        viewPager_314.setAdapter(adapter_314);
        tabLayout_314.setupWithViewPager(viewPager_314);


        goiy_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GoiYLuaChonActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}