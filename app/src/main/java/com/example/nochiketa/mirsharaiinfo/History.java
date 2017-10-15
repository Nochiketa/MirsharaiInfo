package com.example.nochiketa.mirsharaiinfo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class History extends AppCompatActivity {

    TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        T1 = (TextView)findViewById(R.id.textView2);
        setTitle("ইতিহাস");
        T1.setText(R.string.History);
        T1.setTextSize(20);
        T1.setTextColor(Color.BLACK);
        T1.setGravity(Gravity.CENTER);
    }
}
