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

    ImageButton button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12;
    TextView textView,textView2, textView3, textView4,textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        button = (ImageButton) findViewById(R.id.bt1);
        button2 = (ImageButton) findViewById(R.id.bt2);
        button3 = (ImageButton) findViewById(R.id.bt3);
        button4 = (ImageButton) findViewById(R.id.bt4);
        button5 = (ImageButton) findViewById(R.id.bt5);
        button6 = (ImageButton) findViewById(R.id.bt6);
        button7 = (ImageButton) findViewById(R.id.bt7);
        button8 = (ImageButton) findViewById(R.id.bt8);
        button9 = (ImageButton) findViewById(R.id.bt9);
        button10 = (ImageButton) findViewById(R.id.bt10);
        button11 = (ImageButton) findViewById(R.id.bt11);
        button12 = (ImageButton) findViewById(R.id.bt12);
        textView = (TextView)findViewById(R.id.tv2);
        textView2 = (TextView) findViewById(R.id.tv4);
        textView3 = (TextView)findViewById(R.id.tv6);
        textView4 = (TextView) findViewById(R.id.tv13);
        textView5 = (TextView) findViewById(R.id.tv16);
        textView6 = (TextView) findViewById(R.id.tv19);
        textView7 = (TextView) findViewById(R.id.tv22);
        textView8 = (TextView) findViewById(R.id.tv25);
        textView9 = (TextView) findViewById(R.id.tv28);
        textView10 = (TextView) findViewById(R.id.tv31);
        textView11 = (TextView) findViewById(R.id.tv34);
        textView12 = (TextView) findViewById(R.id.tv37);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView2.getText().toString();
                Uri uri = Uri.parse("tel:"+s);
                Intent i = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(i);
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

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s4 = textView4.getText().toString();
                Uri uri4 = Uri.parse("tel:"+s4);
                Intent i4 = new Intent(Intent.ACTION_DIAL, uri4);
                startActivity(i4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s5 = textView5.getText().toString();
                Uri uri5 = Uri.parse("tel:"+s5);
                Intent i5 = new Intent(Intent.ACTION_DIAL, uri5);
                startActivity(i5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s6 = textView6.getText().toString();
                Uri uri6 = Uri.parse("tel:"+s6);
                Intent i6 = new Intent(Intent.ACTION_DIAL, uri6);
                startActivity(i6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s7 = textView7.getText().toString();
                Uri uri7 = Uri.parse("tel:"+s7);
                Intent i7= new Intent(Intent.ACTION_DIAL, uri7);
                startActivity(i7);
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s8 = textView8.getText().toString();
                Uri uri8= Uri.parse("tel:"+s8);
                Intent i8= new Intent(Intent.ACTION_DIAL, uri8);
                startActivity(i8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s9 = textView9.getText().toString();
                Uri uri9= Uri.parse("tel:"+s9);
                Intent i9= new Intent(Intent.ACTION_DIAL, uri9);
                startActivity(i9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s10 = textView10.getText().toString();
                Uri uri10= Uri.parse("tel:"+s10);
                Intent i10= new Intent(Intent.ACTION_DIAL, uri10);
                startActivity(i10);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s11 = textView11.getText().toString();
                Uri uri11= Uri.parse("tel:"+s11);
                Intent i11= new Intent(Intent.ACTION_DIAL, uri11);
                startActivity(i11);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s12 = textView12.getText().toString();
                Uri uri12= Uri.parse("tel:"+s12);
                Intent i12 = new Intent(Intent.ACTION_DIAL, uri12);
                startActivity(i12);
            }
        });
    }
}
