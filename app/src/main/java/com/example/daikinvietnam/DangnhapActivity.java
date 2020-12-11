package com.example.daikinvietnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangnhapActivity extends AppCompatActivity {
    Button tv_tt_314;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        tv_tt_314 = (Button) findViewById(R.id.button_314);
        tv_tt_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DangnhapActivity.this, Dangnhap2Activity.class);
                startActivity(i);
            }
        });
    }
}