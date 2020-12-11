package com.example.daikinvietnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CaiDatActivity extends AppCompatActivity {
    ImageView back_caidat_314;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);

        back_caidat_314 = (ImageView) findViewById(R.id.left_icon);
        back_caidat_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CaiDatActivity.this, Fragment_taikhoan.class);
                startActivity(i);
            }
        });
    }
}