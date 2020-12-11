package com.example.daikinvietnam;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Fragment_thongbao_tt extends Fragment {
    ListView listview_314;
    String [] title ={"Nhanh Tay Nhận Ngay Ưu Đãi Cuối Tháng 11","Tháng 11 Book Bảo Trì Có Ngay Qùa Hay","CÙNG DAIKIN VIETNAM HƯỚNG VỀ MIỀN TRUNG","Thời tiết nồm rồi, bật ngay chế độ Dry khử ẩm","CÙNG DAIKIN VIETNAM HƯỚNG VỀ MIỀN TRUNG","News","News"};
    String [] date ={"1 tuần trước","3 tuần trước","1 tháng trước","1 tháng trước","1 tháng trước","1 tháng trước","1 tháng trước"};
    int[] img = {R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron};
    public Fragment_thongbao_tt() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thongbao_tt,container,false);
        listview_314 = (ListView) view.findViewById(R.id.List_recentview);
        listview_314.setAdapter(new Recentview_Adapter(getActivity(),R.layout.thongbao_tt_detail,title));
        return view;
    }
    class Recentview_Adapter extends ArrayAdapter {
        public Recentview_Adapter (Context context, int resource, String[] objects){
            super(context,resource,objects);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view =((Activity)getContext()).getLayoutInflater().inflate(R.layout.thongbao_tt_detail,null);
            TextView txt1 = (TextView) view.findViewById(R.id.tv1_view);
            txt1.setText(title[position]);
            TextView txt2 = (TextView) view.findViewById(R.id.tv2_view);
            txt2.setText(date[position]);
            ImageView imgs = (ImageView) view.findViewById(R.id.anh_view);
            imgs.setBackgroundResource(img[position]);
            return view;
        }

    }
}