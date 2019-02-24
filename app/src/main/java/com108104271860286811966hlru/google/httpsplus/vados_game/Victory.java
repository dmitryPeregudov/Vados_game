package com108104271860286811966hlru.google.httpsplus.vados_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Victory extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.victory_layout);
        button=(Button)findViewById(R.id.buttonV);
        button.setOnClickListener(this);
        textView=(TextView)findViewById(R.id.textView2);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.animation);
        textView.startAnimation(animation);

    }

    @Override
    public void onClick(View v) {
        int id=button.getId();
        if(id==R.id.buttonV){
            Intent intent=new Intent(this,GameActivity.class);

            startActivity(intent);
            finish();
        }

    }
}
