package com108104271860286811966hlru.google.httpsplus.vados_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.crashlytics.android.Crashlytics;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import io.fabric.sdk.android.Fabric;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3;
private PublisherAdView mPublisherAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,"ca-app-pub-6617610808798148~7293214665");
        button1=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        mPublisherAdView = findViewById(R.id.publisherAdView);
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().addTestDevice("FB48C665468710109C0D51C8B2A9831F").build();
        mPublisherAdView.loadAd(adRequest);


    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.button: intent=new Intent(this,GameActivity.class);startActivity(intent);break;
            case R.id.button2: intent=new Intent(this,HelpActivity.class);startActivity(intent);;break;
            case R.id.button3: finish();break;
        }
finish();
    }
}
