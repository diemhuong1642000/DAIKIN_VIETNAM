package com.example.daikinvietnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CauhoiActivity extends AppCompatActivity {
    ImageView back_cauhoi_314;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cauhoi);

        back_cauhoi_314 = (ImageView) findViewById(R.id.cauhoi);
        back_cauhoi_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CauhoiActivity.this, Fragment_taikhoan.class);
                startActivity(i);
            }
        });
    }
}
