package com.example.kumazawakento.digitalpamphlet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;import android.annotation.SuppressLint;

public class sendaiTestActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendai_test);
        WebView twitterView = (WebView)findViewById(R.id.twitter_web);
        //WebViewClient使用でアプリ内でtwitterを開くことができるのです（どやぁ）
        twitterView.setWebViewClient(new WebViewClient());
        twitterView.loadUrl("https://twitter.com/nut_fes");
        //WebView内でのJavascript利用を有効にする
        twitterView.getSettings().setJavaScriptEnabled(true);
    }


}
