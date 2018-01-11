package com.example.nochiketa.mirsharaiinfo;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VisitableSights extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitable_sights);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("দর্শনীয় স্থান");
        textView = (TextView)findViewById(R.id.VisitableSightText);
        textView.setText(R.string.Sights);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(20);
    }
}
