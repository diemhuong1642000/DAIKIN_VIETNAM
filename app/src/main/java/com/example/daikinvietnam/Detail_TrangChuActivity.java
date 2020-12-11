package com.example.daikinvietnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Detail_TrangChuActivity extends AppCompatActivity {
    ImageView back_detail_314;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__trang_chu);

        back_detail_314 = (ImageView) findViewById(R.id.back_detail_314);
        back_detail_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Detail_TrangChuActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}