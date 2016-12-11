package com.example.kumazawakento.digitalpamphlet;


import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener,
        MainPageFragment.OnFragmentInteractionListener {


//---------------------------------------------------------------------onCreate
    //初期設定
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);
        setViews();


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
                Intent intent = new Intent(getApplication(), TabTestActivity.class);
                startActivity(intent);
            }
        });
        sendaiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), TwitterTestActivity.class);
                startActivity(intent);
            }
        });
        kentButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SimpleTestActivity.class);
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
        //tabLayout.addTab(tabLayout.newTab().setText("HOME"));
        //tabLayout.addTab(tabLayout.newTab().setText("MAP"));
        //tabLayout.addTab(tabLayout.newTab().setText("TIME TABLE"));
        //tabLayout.addTab(tabLayout.newTab().setText("FOODS"));
        //tabLayout.addTab(tabLayout.newTab().setText("EVENT"));
        //------------------------------------

        // xmlからViewPagerを取得
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    private void setViews() {
        FragmentManager manager = getSupportFragmentManager();
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        MainFragmentPagerAdapter adapter = new MainFragmentPagerAdapter(manager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

}
