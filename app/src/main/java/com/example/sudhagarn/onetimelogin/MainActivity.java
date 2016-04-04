package com.example.sudhagarn.onetimelogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static SharedPreferences prefs;
    public static SharedPreferences.Editor editor ;
    public static final String HIGH_SCORES = "HighScores";
    String score,sharename;
    long oldscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefs = getSharedPreferences(HIGH_SCORES, MODE_PRIVATE);

        score = prefs.getString("Score", "0");
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{

                    oldscore= Long.parseLong(score);

                    if (0 == oldscore) {
                        editor = prefs.edit();
                         editor.putString("Score", String.valueOf(1));
                        editor.apply();


                            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                            startActivity(intent);
                        }
                    else
                        {
                            Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                            startActivity(intent);
                        }

                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}