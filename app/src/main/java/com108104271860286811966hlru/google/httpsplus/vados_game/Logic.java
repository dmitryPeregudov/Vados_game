package com108104271860286811966hlru.google.httpsplus.vados_game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class Logic extends AppCompatActivity {

    Logic(){
        for (int i=0;i<=11;i++){
            for (int j=0;j<=11;j++){
                logic[i][j]=0;
            }
        }
    }

   static int lastX=0;
   static int lastY=0;
   static int newX=0;
   static int newY=0;
   static int logic[][]=new int[12][12];


    static int saveLastX=0;
    static int saveLastY=0;


   boolean stepCheck() {

       if (lastX + 2 == newX & lastY + 1 == newY) {
           return true;
       }
       if (lastX + 2 == newX & lastY - 1 == newY) {
           return true;
       }
       if (lastX - 2 == newX & lastY + 1 == newY) {
           return true;
       }
       if (lastX - 2 == newX & lastY - 1 == newY) {
           return true;
       }
       if (lastX + 1 == newX & lastY + 2 == newY) {
           return true;
       }
       if (lastX - 1 == newX & lastY + 2 == newY) {
           return true;
       }
       if (lastX + 1 == newX & lastY - 2 == newY) {
           return true;
       }
       if (lastX - 1 == newX & lastY - 2 == newY) {
           return true;

       }

       return false;

   }




}
