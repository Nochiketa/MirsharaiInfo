package com.example.nochiketa.mirsharaiinfo;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView T1;
    ListView listView;
    String[] val;

    ///@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        T1 = (TextView)findViewById(R.id.textView1);
        listView = (ListView) findViewById(R.id.list_item2);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        final int position = extras.getInt("POS");

        if(position == 0)
        {
            setTitle("পরিচিতি");
            val = new String[] {"এক নজরে মীরসরাই", "ভৌগলিক পরিচিতি", "মানচিত্রে মীরসরাই", "ইউনিয়ন সমূহ", "ভাষা ও সংস্কৃতি"};

            ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
            listView.setAdapter(listAdapter);
        }
        if(position == 1)
        {
            setTitle("ইতিহাস");
            T1.setText(R.string.History);
            T1.setTextSize(18);
            T1.setTextColor(Color.parseColor("#000000"));
            //T1.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        }
        if(position == 2)
        {

        }
        if(position == 3)
        {

        }
        if(position == 4)
        {

        }
        if(position == 5)
        {

        }
    }
}
