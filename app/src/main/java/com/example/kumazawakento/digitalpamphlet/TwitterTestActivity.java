package com.example.kumazawakento.digitalpamphlet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;import android.annotation.SuppressLint;

public class TwitterTestActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_test);
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

        Intent intent = getIntent();
        String url =intent.getStringExtra("url");
        WebView twitterView = (WebView)findViewById(R.id.twitter_web);
        //WebViewClient使用でアプリ内でtwitterを開くことができるのです（どやぁ）
        twitterView.setWebViewClient(new WebViewClient());
        //twitterView.loadUrl("https://twitter.com/nut_fes");
        twitterView.loadUrl(url);
        //WebView内でのJavascript利用を有効にする
        twitterView.getSettings().setJavaScriptEnabled(true);
    }


}
