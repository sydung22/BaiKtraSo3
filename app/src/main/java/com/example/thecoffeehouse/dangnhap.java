package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dangnhap extends AppCompatActivity {
    TextView tvdangky207;
    Button btlogin207;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        tvdangky207 = (TextView) findViewById(R.id.txtdangky);
        tvdangky207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dangnhap.this,dangky.class));
            }
        });
        btlogin207 = (Button) findViewById(R.id.btn_login);
        btlogin207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dangnhap.this,Home.class));
            }
        });
    }
}