package com.example.daikinvietnam;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class Fragment_trangchu extends Fragment {
    ImageView imgnext_314,imgdongho_314;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_trangchu, container, false);
        ViewPager viewPager = v.findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(getContext());
        viewPager.setAdapter(adapter);

        imgnext_314 = (ImageView) v.findViewById(R.id.next_gylc);
        imgdongho_314 = (ImageView) v.findViewById(R.id.dongho);
        imgnext_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), GoiYLuaChonActivity.class);
                getActivity().startActivity(i);
            }
        });
        imgdongho_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Detail_TrangChuActivity.class);
                getActivity().startActivity(i);
            }
        });
        return v;

    }
}
