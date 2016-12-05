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

    private MainFragmentPagerAdapter mAdapter;
    private ViewPager mPager;
    private TitlePageIndicator mIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);


        //-------------------------pager.tab.drawer
        /*
        Intent intent = new Intent(getApplication(), TabActivity.class);
        startActivity(intent);
        */

        /*
        //------------------------pager
        mAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        TitlePageIndicator indicator = (TitlePageIndicator)findViewById(R.id.indicator);
        mIndicator = indicator;
        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;
        indicator.setBackgroundColor(0x18FF0000);
        indicator.setFooterColor(0xFFAA2222);
        indicator.setFooterLineHeight(1 * density); //1dp
        indicator.setFooterIndicatorHeight(3 * density); //3dp
        indicator.setFooterIndicatorStyle(TitlePageIndicator.IndicatorStyle.Underline);
        indicator.setTextColor(0xAA000000);
        indicator.setSelectedColor(0xFF000000);
        indicator.setSelectedBold(true);
        //-----------------------------------------------------------------------------
        */


        //-----------------------ウィジェット紐付け
        Button gainButton = (Button)findViewById(R.id.button_gain);
        Button sendaiButton = (Button)findViewById(R.id.button_sendai);
        Button kentButton = (Button)findViewById(R.id.button_kent);
        //---------------------------------------



        //------------- buttonListener gain
        gainButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), gainTestActivity.class);
                startActivity(intent);
            }
        });
        //------------------------------------


        //------------- buttonListener sendai
        sendaiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), sendaiTestActivity.class);
                startActivity(intent);
            }
        });
        //------------------------------------

        //------------- buttonListener kent
        kentButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), kentTestActivity.class);
                startActivity(intent);
            }
        });
        //------------------------------------


        //------------------------タブ設定
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("HOME"));
        tabLayout.addTab(tabLayout.newTab().setText("ARTIST"));
        tabLayout.addTab(tabLayout.newTab().setText("TIME TABLE"));
        tabLayout.addTab(tabLayout.newTab().setText("FOODS"));
        tabLayout.addTab(tabLayout.newTab().setText("GOODS"));


    }

    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("aaaaaaaa");

        // メニューの要素を追加して取得
        MenuItem actionItem = menu.add("Action Button Help Icon");
        // アイコンを設定
        actionItem.setIcon(android.R.drawable.ic_menu_help);

        // SHOW_AS_ACTION_ALWAYS:常に表示
        actionItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
