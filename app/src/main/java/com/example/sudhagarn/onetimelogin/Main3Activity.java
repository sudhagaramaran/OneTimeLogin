package com.example.sudhagarn.onetimelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button next_btn=(Button)findViewById(R.id.button2);
        next_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
   //  MainActivity.editor.putString("Score", String.valueOf(0));

   // String x= MainActivity.prefs.getString("Score","1");
    //    String y=x;
    //    String z=y;
        MainActivity.editor =MainActivity.prefs.edit();
        MainActivity.editor.putString("Score", String.valueOf(0));
      MainActivity.editor.apply();
    //    String x1= MainActivity.prefs.getString("Score","0");
     //   String y1=x1;
     //   String z1=y1;
     //   MainActivity.editor =MainActivity.prefs.edit();
      //  MainActivity.editor.clear();

    }
}
