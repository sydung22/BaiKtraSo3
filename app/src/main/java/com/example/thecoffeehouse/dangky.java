package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dangky extends AppCompatActivity {
    TextView tvdangnhap207;
    Button btsignup207;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        tvdangnhap207 = (TextView) findViewById(R.id.txtdangnhap);
        tvdangnhap207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dangky.this,dangnhap.class));
            }
        });
        btsignup207 = (Button) findViewById(R.id.btn_signup);
        btsignup207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dangky.this,dangnhap.class));
            }
        });
    }
}