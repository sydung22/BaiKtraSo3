package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class orderScreen extends AppCompatActivity {
    RecyclerView order_recycle;
    orderAdapter orderAdapter;
    TabLayout tabLayout207;
    TabItem tab1,tab2,tab3;
    ViewPager viewPager207;
    PagerAdapter pagerAdapter207;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);
        tabLayout207 = findViewById(R.id.tablayout);
        tab1 =findViewById(R.id.tab1);
        tab2 =findViewById(R.id.tab2);
        tab3 =findViewById(R.id.tab3);
        viewPager207 =findViewById(R.id.viewpaper);
        pagerAdapter207 = new PagerAdapter(getSupportFragmentManager(),tabLayout207.getTabCount());
//        pagerAdapter = new com.example.thecoffeehouse.PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager207.setAdapter(pagerAdapter207);

        tabLayout207.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager207.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerAdapter207.notifyDataSetChanged();
                } else if (tab.getPosition() == 1) {
                    pagerAdapter207.notifyDataSetChanged();
                } else if (tab.getPosition() == 2) {
                    pagerAdapter207.notifyDataSetChanged();
                }



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager207.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout207));
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.delivery);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
//                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

}