package com.example.kumazawakento.digitalpamphlet;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.viewpagerindicator.TitlePageIndicator;

public class MainActivity extends AppCompatActivity {

    //private MainFragmentPagerAdapter mAdapter;
    private ViewPager mPager;
    private TitlePageIndicator mIndicator;

//---------------------------------------------------------------------onCreate
    //初期設定
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);


        //-----------------------ウィジェット紐付け
        Button gainButton = (Button)findViewById(R.id.button_gain);
        Button sendaiButton = (Button)findViewById(R.id.button_sendai);
        Button kentButton = (Button)findViewById(R.id.button_kent);
        Button testButton = (Button)findViewById(R.id.button_test);
        //---------------------------------------


        //------------- buttonListener
        gainButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), gainTestActivity.class);
                startActivity(intent);
            }
        });
        sendaiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), sendaiTestActivity.class);
                startActivity(intent);
            }
        });
        kentButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), kentTestActivity.class);
                startActivity(intent);
            }
        });
        testButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //-------------------------pager.tab.drawer
                Intent intent = new Intent(getApplication(), TabActivity.class);
                startActivity(intent);
            }
        });
        //------------------------------------


        //------------------------タブ設定
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("HOME"));
        tabLayout.addTab(tabLayout.newTab().setText("MAP"));
        tabLayout.addTab(tabLayout.newTab().setText("TIME TABLE"));
        tabLayout.addTab(tabLayout.newTab().setText("FOODS"));
        tabLayout.addTab(tabLayout.newTab().setText("EVENT"));
        //------------------------------------
    }


}
