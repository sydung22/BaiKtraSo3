package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class account_screen extends AppCompatActivity {
    ImageView imgcircle207;
    TextView rewardmem207;
    TextView tvdangxuat207;
    TextView tvthongtin207;
    TextView tvlichsu207;
    TextView tvamnhac207;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_screen);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.account);
        imgcircle207= (ImageView) findViewById(R.id.circleImage);
        imgcircle207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(account_screen.this, profile_screen.class));
            }
        });
        rewardmem207 = (TextView) findViewById(R.id.rewardmember);
        rewardmem207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(account_screen.this,rewardmem.class));
            }
        });
        tvdangxuat207 = (TextView) findViewById(R.id.txtdangxuat);
        tvdangxuat207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(account_screen.this,dangnhap.class));
            }
        });
        tvthongtin207 = (TextView) findViewById(R.id.txtthongtin);
        tvthongtin207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(account_screen.this, profile_screen.class));
            }
        });
        tvlichsu207 = (TextView) findViewById(R.id.txtlichsu);
        tvlichsu207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(account_screen.this,lichsudh.class));
            }
        });
        tvamnhac207 = (TextView) findViewById(R.id.amnhac);
        tvamnhac207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(account_screen.this,nhacdangphat.class));
            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
//                        startActivity(new Intent(getApplicationContext(),account_screen.class));
//                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}