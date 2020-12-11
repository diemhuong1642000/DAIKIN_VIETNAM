package com.example.daikinvietnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThongTinHoTroActivity extends AppCompatActivity {
    ImageView back_thongtinht_314;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_ho_tro);

        back_thongtinht_314 = (ImageView) findViewById(R.id.thongtinhotro);
        back_thongtinht_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThongTinHoTroActivity.this, Fragment_taikhoan.class);
                startActivity(i);
            }
        });
    }
}
