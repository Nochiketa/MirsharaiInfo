package com.example.nochiketa.mirsharaiinfo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.net.URI;

public class phoneNumberActivity extends AppCompatActivity {

    ImageButton button, button2, button3;
    TextView textView,textView2, textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        button = (ImageButton) findViewById(R.id.bt1);
        button2 = (ImageButton) findViewById(R.id.bt2);
        button3 = (ImageButton) findViewById(R.id.bt3);
        textView = (TextView)findViewById(R.id.tv2);
        textView2 = (TextView) findViewById(R.id.tv4);
        textView3 = (TextView)findViewById(R.id.tv6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s2 = textView2.getText().toString();
                Uri uri2 = Uri.parse("tel:"+s2);
                Intent i2 = new Intent(Intent.ACTION_DIAL, uri2);
                startActivity(i2);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s2 = textView2.getText().toString();
                Uri uri2 = Uri.parse("tel:" + s2);
                Intent i2 = new Intent(Intent.ACTION_DIAL, uri2);
                startActivity(i2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s3 = textView3.getText().toString();
                Uri uri3 = Uri.parse("tel:"+s3);
                Intent i3 = new Intent(Intent.ACTION_DIAL, uri3);
                startActivity(i3);
            }
        });
    }
}
