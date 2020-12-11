package com.example.daikinvietnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dangnhap2Activity extends AppCompatActivity {
    Button bt_dn2_314;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap2);
        bt_dn2_314 = (Button) findViewById(R.id.bt_dn2_314);
        bt_dn2_314.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dangnhap2Activity.this, Dangnhap3Activity.class);
                startActivity(i);
            }
        });
    }
}