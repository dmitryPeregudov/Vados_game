package com108104271860286811966hlru.google.httpsplus.vados_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textView;
    private PublisherAdView mPublisherAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helplayout);
        MobileAds.initialize(this,"ca-app-pub-6617610808798148~7293214665");
        button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(this);
        textView=(TextView)findViewById(R.id.textView);
        mPublisherAdView = findViewById(R.id.publisherAdView2);
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().build();
        mPublisherAdView.loadAd(adRequest);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.button4: intent=new Intent(this,MainActivity.class);break;
        }
        finish();
        startActivity(intent);
    }
}
