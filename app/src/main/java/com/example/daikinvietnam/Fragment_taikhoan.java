package com.example.daikinvietnam;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_taikhoan extends Fragment {
    TextView tv_thht_314,tv_cd_314,tv_cauhoi_314;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_taikhoan, container, false);

        tv_thht_314 = (TextView) v.findViewById(R.id.thongtin_ht);
        tv_cd_314 = (TextView) v.findViewById(R.id.Caidat);
        tv_cauhoi_314 = (TextView) v.findViewById(R.id.Cauhoi_tg);
        tv_thht_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ThongTinHoTroActivity.class);
                getActivity().startActivity(i);
            }
        });
        tv_cd_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CaiDatActivity.class);
                getActivity().startActivity(i);
            }
        });
        tv_cauhoi_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CauhoiActivity.class);
                getActivity().startActivity(i);
            }
        });
        return v;
    }
}