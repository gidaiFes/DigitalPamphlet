package com.example.kumazawakento.digitalpamphlet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.support.design.widget.TabLayout;
import android.widget.TextView;

public class gainTestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_test);

        TextView textView = (TextView)findViewById(R.id.textView);

        //------------------------タブ設定
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("タブ1"));
        tabLayout.addTab(tabLayout.newTab().setText("タブ2"));
        tabLayout.addTab(tabLayout.newTab().setText("タブ3"));
        tabLayout.addTab(tabLayout.newTab().setText("タブ4"));
        tabLayout.addTab(tabLayout.newTab().setText("タブ5"));

    }

}
