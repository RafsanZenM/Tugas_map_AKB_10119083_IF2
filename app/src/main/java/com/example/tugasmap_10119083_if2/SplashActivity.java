package com.example.tugasmap_10119083_if2;
//Nama : Rafsan Zen Mustaofa
//Nim : 10119083
//kelas : IF-2
//23/04/2022
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;



public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}