package com.example.kumazawakento.digitalpamphlet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.support.design.widget.TabLayout;

public class gainTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_test);


        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("タブ1"));
        tabLayout.addTab(tabLayout.newTab().setText("タブ2"));
        tabLayout.addTab(tabLayout.newTab().setText("タブ3"));


    }

}
