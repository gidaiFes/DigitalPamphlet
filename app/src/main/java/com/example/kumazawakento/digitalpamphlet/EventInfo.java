package com.example.kumazawakento.digitalpamphlet;

import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.widget.TextView;

import static com.example.kumazawakento.digitalpamphlet.R.drawable.event1;
import static com.example.kumazawakento.digitalpamphlet.R.id.switch1;
import static com.example.kumazawakento.digitalpamphlet.R.id.testTextView;
import static com.example.kumazawakento.digitalpamphlet.R.id.textView;

public class EventInfo {

    public static String getEventName(int i){
        String[] name = {"リアル謎解き探索ゲーム","カラオケ大会"};
                return  name[i];
        }

    public static String getEventText(int i){
        String info = "";
        switch (i){
            case 0:
                info = "今年度目玉の新企画！\n" +
                        "技大の謎を解き明かせ！？\n" +
                        "今年から始まる新企画！\n" +
                        "謎解きに自信がある人集まれ！\n" +
                        "開催日時・場所\n" +
                        "9/17(土)　10:00~15:00 案内所,他\n" +
                        "9/18(日)　10:00~14:00 案内所,他";
                return  info;
            case 1:
                info = "技大うたうま王決定戦！！\n" +
                        "技大の中で一番歌がうまいのは誰だ！？\n" +
                        "開催日時・場所\n" +
                        "9/17(土) 晴 12:00~13:00 メインステージ\n" +
                        "　　　　雨 12:00~13:00 体育館";
                return info;

        }

        return info;
    }


    public static Drawable getImageRes(int i, View v){
        Drawable drawable = ResourcesCompat.getDrawable(v.getResources(), R.drawable.event1, null);
        switch (i){
            case 0:
                drawable = ResourcesCompat.getDrawable(v.getResources(), R.drawable.event1, null);
                return drawable;
            case 1:
                drawable = ResourcesCompat.getDrawable(v.getResources(), R.drawable.event2, null);
                return drawable;
        }
        return drawable;
    }
}
