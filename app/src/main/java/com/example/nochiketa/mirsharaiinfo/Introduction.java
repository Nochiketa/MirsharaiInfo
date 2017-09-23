package com.example.nochiketa.mirsharaiinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import static com.example.nochiketa.mirsharaiinfo.R.styleable.View;

public class Introduction extends AppCompatActivity {

    ListView listView;
    String[] val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView)findViewById(R.id.list_item1);

        setTitle("পরিচিতি");

        val =new String[]{"এক নজরে মীরসরাই","ভৈগলিক পরিচিতি", "মানচিত্রে মীরসরাই", "ইউনিয়ন সমূহ", "ঊপজেলা ও ঐতিহ্য", "ভাষা ও সংস্কৃতি"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.item, R.id.TV, val);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Intent i = new Intent(Introduction.this, IntroductionDetails.class);
                i.putExtra("pos", position);
                startActivity(i);
            }
        });
    }
}
