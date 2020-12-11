package com.example.daikinvietnam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Goiyluachon_Thietbi extends Fragment {
    GridView gridView_314;
    String[] title_314 = {"Máy điều hòa treo tường","Máy điều hòa Sky Airs","Máy điều hòa VRV","Máy điều hòa Multi","Máy lọc không khí","Máy điều hòa Packaged"};
    int [] img_314 = {R.drawable.maydieuhoa, R.drawable.dh_sky, R.drawable.dh_vrv,R.drawable.dh_multi,R.drawable.maylockk,R.drawable.dh_packaged};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_342 =  inflater.inflate(R.layout.activity_goiyluachon__thietbi,container,false);
        gridView_314 = (GridView) v_342.findViewById(R.id.gridview_thietbi_314);
        CustomAdapter customAdapter_342 = new CustomAdapter();
        gridView_314.setAdapter(customAdapter_342);
        return v_342;
    }
    private class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return img_314.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view_342 = getLayoutInflater().inflate(R.layout.activity_rowdata_goiyluachon_thietbi,null);
            TextView name_342 = view_342.findViewById(R.id.tv_item_moiday);
            ImageView image_342 = view_342.findViewById(R.id.img_item_moiday);

            name_342.setText(title_314[position]);
            image_342.setImageResource(img_314[position]);
            return  view_342;
        }
    }
}