package com.example.kumazawakento.digitalpamphlet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class TabTestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_test);


        final TextView textView = (TextView)findViewById(R.id.testTextView);


        // ツールバーをアクションバーとしてセット
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        //toolbar.setLogo(R.drawable.gidai);
        toolbar.setTitle("This is title");
        toolbar.setSubtitle("Test Activity");


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    //------------------------タブ設定
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("HOME"));
        tabLayout.addTab(tabLayout.newTab().setText("ARTIST"));
        tabLayout.addTab(tabLayout.newTab().setText("TIME TABLE"));
        tabLayout.addTab(tabLayout.newTab().setText("FOODS"));
        tabLayout.addTab(tabLayout.newTab().setText("GOODS"));

    }

}
