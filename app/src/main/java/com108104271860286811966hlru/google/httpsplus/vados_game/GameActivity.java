package com108104271860286811966hlru.google.httpsplus.vados_game;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private PublisherAdView mPublisherAdView;
    Logic logic = new Logic();
    static Button button[][] = new Button[8][8];
    private int count = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_lay);
        MobileAds.initialize(this, "ca-app-pub-6617610808798148~7293214665");
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x / 8;
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(width, width);

        button[0][0] = (Button) findViewById(R.id.butt1);
        button[0][1] = (Button) findViewById(R.id.butt2);
        button[0][2] = (Button) findViewById(R.id.butt3);
        button[0][3] = (Button) findViewById(R.id.butt4);
        button[0][4] = (Button) findViewById(R.id.butt5);
        button[0][5] = (Button) findViewById(R.id.butt6);
        button[0][6] = (Button) findViewById(R.id.butt7);
        button[0][7] = (Button) findViewById(R.id.butt8);
        button[1][0] = (Button) findViewById(R.id.butt9);
        button[1][1] = (Button) findViewById(R.id.butt10);
        button[1][2] = (Button) findViewById(R.id.butt11);
        button[1][3] = (Button) findViewById(R.id.butt12);
        button[1][4] = (Button) findViewById(R.id.butt13);
        button[1][5] = (Button) findViewById(R.id.butt14);
        button[1][6] = (Button) findViewById(R.id.butt15);
        button[1][7] = (Button) findViewById(R.id.butt16);
        button[2][0] = (Button) findViewById(R.id.butt17);
        button[2][1] = (Button) findViewById(R.id.butt18);
        button[2][2] = (Button) findViewById(R.id.butt19);
        button[2][3] = (Button) findViewById(R.id.butt20);
        button[2][4] = (Button) findViewById(R.id.butt21);
        button[2][5] = (Button) findViewById(R.id.butt22);
        button[2][6] = (Button) findViewById(R.id.butt23);
        button[2][7] = (Button) findViewById(R.id.butt24);
        button[3][0] = (Button) findViewById(R.id.butt25);
        button[3][1] = (Button) findViewById(R.id.butt26);
        button[3][2] = (Button) findViewById(R.id.butt27);
        button[3][3] = (Button) findViewById(R.id.butt28);
        button[3][4] = (Button) findViewById(R.id.butt29);
        button[3][5] = (Button) findViewById(R.id.butt30);
        button[3][6] = (Button) findViewById(R.id.butt31);
        button[3][7] = (Button) findViewById(R.id.butt32);
        button[4][0] = (Button) findViewById(R.id.butt33);
        button[4][1] = (Button) findViewById(R.id.butt34);
        button[4][2] = (Button) findViewById(R.id.butt35);
        button[4][3] = (Button) findViewById(R.id.butt36);
        button[4][4] = (Button) findViewById(R.id.butt37);
        button[4][5] = (Button) findViewById(R.id.butt38);
        button[4][6] = (Button) findViewById(R.id.butt39);
        button[4][7] = (Button) findViewById(R.id.butt40);
        button[5][0] = (Button) findViewById(R.id.butt41);
        button[5][1] = (Button) findViewById(R.id.butt42);
        button[5][2] = (Button) findViewById(R.id.butt43);
        button[5][3] = (Button) findViewById(R.id.butt44);
        button[5][4] = (Button) findViewById(R.id.butt45);
        button[5][5] = (Button) findViewById(R.id.butt46);
        button[5][6] = (Button) findViewById(R.id.butt47);
        button[5][7] = (Button) findViewById(R.id.butt48);
        button[6][0] = (Button) findViewById(R.id.butt49);
        button[6][1] = (Button) findViewById(R.id.butt50);
        button[6][2] = (Button) findViewById(R.id.butt51);
        button[6][3] = (Button) findViewById(R.id.butt52);
        button[6][4] = (Button) findViewById(R.id.butt53);
        button[6][5] = (Button) findViewById(R.id.butt54);
        button[6][6] = (Button) findViewById(R.id.butt55);
        button[6][7] = (Button) findViewById(R.id.butt56);
        button[7][0] = (Button) findViewById(R.id.butt57);
        button[7][1] = (Button) findViewById(R.id.butt58);
        button[7][2] = (Button) findViewById(R.id.butt59);
        button[7][3] = (Button) findViewById(R.id.butt60);
        button[7][4] = (Button) findViewById(R.id.butt61);
        button[7][5] = (Button) findViewById(R.id.butt62);
        button[7][6] = (Button) findViewById(R.id.butt63);
        button[7][7] = (Button) findViewById(R.id.butt64);
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                button[i][k].setOnClickListener(this);
                button[i][k].setLayoutParams(layoutParams);

            }

        }
        mPublisherAdView = findViewById(R.id.publisherAdView3);
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().build();
        mPublisherAdView.loadAd(adRequest);
        int a = (int) (Math.random() * 8);
        int b = (int) (Math.random() * 8);
        if (
                a==0 & b==0
              ||a==0 & b==2
              ||a==0 & b==4
              ||a==0 & b==6
              ||a==1 & b==1
              ||a==1 & b==3
              ||a==1 & b==5
              ||a==1 & b==7
              ||a==2 & b==0
                        ||a==2 & b==2
                        ||a==2 & b==4
                        ||a==2 & b==6
                        ||a==3 & b==1
                        ||a==3 & b==3
                        ||a==3 & b==5
                        ||a==3 & b==7
       || a==4 & b==0
                ||a==4 & b==2
                ||a==4 & b==4
                ||a==4 & b==6
                ||a==5 & b==1
                ||a==5 & b==3
                ||a==5 & b==5
                ||a==5 & b==7
       || a==6 & b==0
                ||a==6 & b==2
                ||a==6 & b==4
                ||a==6 & b==6
                ||a==7 & b==1
                ||a==7 & b==3
                ||a==7 & b==5
                ||a==7 & b==7
                ) {
            button[a][b].setBackgroundResource(R.drawable.light_horse);
        } else {
            button[a][b].setBackgroundResource(R.drawable.dark_horse);
        }
        GameActivity.button[a][b].setEnabled(false);
        Logic.logic[a+2][b+2] = 1;
        Logic.lastX = a;
        Logic.lastY = b;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butt1:
                Logic.newX = 0;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt2:
                Logic.newX = 0;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt3:
                Logic.newX = 0;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt4:
                Logic.newX = 0;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt5:
                Logic.newX = 0;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt6:
                Logic.newX = 0;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt7:
                Logic.newX = 0;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt8:
                Logic.newX = 0;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt9:
                Logic.newX = 1;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt10:
                Logic.newX = 1;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt11:
                Logic.newX = 1;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt12:
                Logic.newX = 1;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt13:
                Logic.newX = 1;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt14:
                Logic.newX = 1;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt15:
                Logic.newX = 1;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt16:
                Logic.newX = 1;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt17:
                Logic.newX = 2;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt18:
                Logic.newX = 2;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt19:
                Logic.newX = 2;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt20:
                Logic.newX = 2;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt21:
                Logic.newX = 2;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt22:
                Logic.newX = 2;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt23:
                Logic.newX = 2;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt24:
                Logic.newX = 2;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt25:
                Logic.newX = 3;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt26:
                Logic.newX = 3;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt27:
                Logic.newX = 3;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt28:
                Logic.newX = 3;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt29:
                Logic.newX = 3;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt30:
                Logic.newX = 3;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt31:
                Logic.newX = 3;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt32:
                Logic.newX = 3;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt33:
                Logic.newX = 4;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt34:
                Logic.newX = 4;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt35:
                Logic.newX = 4;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt36:
                Logic.newX = 4;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt37:
                Logic.newX = 4;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt38:
                Logic.newX = 4;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt39:
                Logic.newX = 4;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt40:
                Logic.newX = 4;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt41:
                Logic.newX = 5;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt42:
                Logic.newX = 5;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt43:
                Logic.newX = 5;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt44:
                Logic.newX = 5;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt45:
                Logic.newX = 5;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt46:
                Logic.newX = 5;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt47:
                Logic.newX = 5;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt48:
                Logic.newX = 5;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt49:
                Logic.newX = 6;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt50:
                Logic.newX = 6;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt51:
                Logic.newX = 6;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt52:
                Logic.newX = 6;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt53:
                Logic.newX = 6;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt54:
                Logic.newX = 6;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt55:
                Logic.newX = 6;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt56:
                Logic.newX = 6;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt57:
                Logic.newX = 7;
                Logic.newY = 0;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt58:
                Logic.newX = 7;
                Logic.newY = 1;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt59:
                Logic.newX = 7;
                Logic.newY = 2;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt60:
                Logic.newX = 7;
                Logic.newY = 3;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt61:
                Logic.newX = 7;
                Logic.newY = 4;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt62:
                Logic.newX = 7;
                Logic.newY = 5;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt63:
                Logic.newX = 7;
                Logic.newY = 6;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;
            case R.id.butt64:
                Logic.newX = 7;
                Logic.newY = 7;
                resort(showDialog(logic.stepCheck()));
                victoryCheck();deadEndCheck();
                break;

        }

    }

    boolean showDialog(boolean a) {
        if (a) {
            return true;
        } else Toast.makeText(GameActivity.this, R.string.eror, Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.restart:
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                break;
            case R.id.exit:
                finish();
                break;
            case R.id.back:
                stepCancel();
                break;
        }

        return true;
    }

    void resort(boolean a) {

        if (a) {


            if (logic.newX==0 && logic.newY==0
            ||logic.newX==0 && logic.newY==2
                    ||logic.newX==0 && logic.newY==4
                    ||logic.newX==0 && logic.newY==6
                    ||logic.newX==1 && logic.newY==1
                    ||logic.newX==1 && logic.newY==3
                    ||logic.newX==1 && logic.newY==5
                    ||logic.newX==1 && logic.newY==7

                    ||logic.newX==2 && logic.newY==0
                    ||logic.newX==2 && logic.newY==2
                    ||logic.newX==2 && logic.newY==4
                    ||logic.newX==2 && logic.newY==6
                    ||logic.newX==3 && logic.newY==1
                    ||logic.newX==3 && logic.newY==3
                    ||logic.newX==3 && logic.newY==5
                    ||logic.newX==3 && logic.newY==7

                    ||logic.newX==4 && logic.newY==0
                    ||logic.newX==4 && logic.newY==2
                    ||logic.newX==4 && logic.newY==4
                    ||logic.newX==4 && logic.newY==6
                    ||logic.newX==5 && logic.newY==1
                    ||logic.newX==5 && logic.newY==3
                    ||logic.newX==5 && logic.newY==5
                    ||logic.newX==5 && logic.newY==7

                    ||logic.newX==6 && logic.newY==0
                    ||logic.newX==6 && logic.newY==2
                    ||logic.newX==6 && logic.newY==4
                    ||logic.newX==6 && logic.newY==6
                    ||logic.newX==7 && logic.newY==1
                    ||logic.newX==7 && logic.newY==3
                    ||logic.newX==7 && logic.newY==5
                    ||logic.newX==7 && logic.newY==7

                    ) {
                GameActivity.button[logic.newX][logic.newY].setBackgroundResource(R.drawable.light_horse);
                GameActivity.button[logic.newX][logic.newY].setEnabled(false);
                logic.logic[logic.newX+2][logic.newY+2] = 1;
                GameActivity.button[logic.lastX][logic.lastY].setBackgroundResource(R.drawable.dark_cross);


            } else {
                GameActivity.button[logic.newX][logic.newY].setBackgroundResource(R.drawable.dark_horse);
                GameActivity.button[logic.newX][logic.newY].setEnabled(false);
                logic.logic[logic.newX+2][logic.newY+2] = 1;
                GameActivity.button[logic.lastX][logic.lastY].setBackgroundResource(R.drawable.light_cross);

            }

            logic.saveLastX = logic.lastX;
            logic.saveLastY = logic.lastY;
            logic.lastX = logic.newX;
            logic.lastY = logic.newY;

        }
    }



    void stepCancel(){
        if(logic.lastX!=logic.saveLastX&logic.lastY!=logic.saveLastY) {
            if (
                    logic.saveLastX==0 & logic.saveLastY==0
            ||  logic.saveLastX==0 & logic.saveLastY==2
                    ||  logic.saveLastX==0 & logic.saveLastY==4
                    ||  logic.saveLastX==0 & logic.saveLastY==6
                    ||  logic.saveLastX==1 & logic.saveLastY==1
                    ||  logic.saveLastX==1 & logic.saveLastY==3
                    ||  logic.saveLastX==1 & logic.saveLastY==5
                    ||  logic.saveLastX==1 & logic.saveLastY==7
                || logic.saveLastX==2 & logic.saveLastY==0
                            ||  logic.saveLastX==2 & logic.saveLastY==2
                            ||  logic.saveLastX==2 & logic.saveLastY==4
                            ||  logic.saveLastX==2 & logic.saveLastY==6
                            ||  logic.saveLastX==3 & logic.saveLastY==1
                            ||  logic.saveLastX==3 & logic.saveLastY==3
                            ||  logic.saveLastX==3 & logic.saveLastY==5
                            ||  logic.saveLastX==3 & logic.saveLastY==7
                            || logic.saveLastX==4 & logic.saveLastY==0
                            ||  logic.saveLastX==4 & logic.saveLastY==2
                            ||  logic.saveLastX==4 & logic.saveLastY==4
                            ||  logic.saveLastX==4 & logic.saveLastY==6
                            ||  logic.saveLastX==5 & logic.saveLastY==1
                            ||  logic.saveLastX==5 & logic.saveLastY==3
                            ||  logic.saveLastX==5 & logic.saveLastY==5
                            ||  logic.saveLastX==5 & logic.saveLastY==7
                            || logic.saveLastX==6 & logic.saveLastY==0
                            ||  logic.saveLastX==6 & logic.saveLastY==2
                            ||  logic.saveLastX==6 & logic.saveLastY==4
                            ||  logic.saveLastX==6 & logic.saveLastY==6
                            ||  logic.saveLastX==7 & logic.saveLastY==1
                            ||  logic.saveLastX==7 & logic.saveLastY==3
                            ||  logic.saveLastX==7 & logic.saveLastY==5
                            ||  logic.saveLastX==7 & logic.saveLastY==7)
                    {
                GameActivity.button[logic.saveLastX][logic.saveLastY].setBackgroundResource(R.drawable.light_horse);
                GameActivity.button[logic.lastX][logic.lastY].setEnabled(true);
                logic.logic[logic.lastX+2][logic.lastY+2] = 0;
                GameActivity.button[logic.lastX][logic.lastY].setBackgroundResource(R.drawable.dark);
                logic.lastX = logic.saveLastX;
                logic.lastY = logic.saveLastY;
            } else {
                GameActivity.button[logic.saveLastX][logic.saveLastY].setBackgroundResource(R.drawable.dark_horse);
                GameActivity.button[logic.lastX][logic.lastY].setEnabled(true);
                logic.logic[logic.lastX+2][logic.lastY+2] = 0;
                GameActivity.button[logic.lastX][logic.lastY].setBackgroundResource(R.drawable.light);
                logic.lastX = logic.saveLastX;
                logic.lastY = logic.saveLastY;
            }

        }
    }


    void victoryCheck(){
        for (int i=0;i<12;i++){
            for (int k=0;k<12;k++){
                if (logic.logic[i][k]==1){count++;}
            }
        }
        if(count==144){
            Intent intent=new Intent(this,Victory.class);
            finish();
            startActivity(intent);
        }
        else count=0;

    }


    void deadEndCheck(){
        int a=logic.lastX+2, b=logic.lastY+2;
if (logic.logic[a+2][b+1]==1
        && logic.logic[a+2][b-1]==1
        && logic.logic[a-2][b+1]==1
        && logic.logic[a-2][b-1]==1

        && logic.logic[a+1][b+2]==1
        && logic.logic[a-1][b+2]==1
        && logic.logic[a+1][b-2]==1
        && logic.logic[a-1][b-2]==1
        ) {
    AlertDialog.Builder builder = new AlertDialog.Builder(GameActivity.this);
    builder.setTitle(R.string.sorry)
            .setMessage(R.string.alert)
            .setCancelable(false)
            .setNegativeButton(R.string.replay,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }
                    });
    AlertDialog alert = builder.create();
    alert.show();



}


    }
}







