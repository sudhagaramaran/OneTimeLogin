package com.example.sudhagarn.onetimelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
public static boolean val=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button next_btn=(Button)findViewById(R.id.button);
        next_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent in=new Intent(this,Main3Activity.class);
        startActivity(in);

    }
}
