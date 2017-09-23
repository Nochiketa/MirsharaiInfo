package com.example.nochiketa.mirsharaiinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntroductionDetails extends AppCompatActivity {
    TextView T2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_details);

        T2 = (TextView)findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        final int position = extras.getInt("pos");

        if(position == 0)
        {
            setTitle("এক নজরে মীরসরাই");
            T2.setText(R.string.eknojoreMirsharai);
        }
        else if(position == 1)
        {
            setTitle("ভৈগলিক পরিচিতি");
            T2.setText(R.string.vougolikporichiti);
        }
        else if(position == 2)
        {
            setTitle("মানচিত্রে মীরসরাই");
            T2.setText(R.string.manchitreMirsharai);
        }
        else if(position == 3)
        {
            setTitle("ইউনিয়ন সমূহ");
            T2.setText(R.string.UnionShomuho);
        }
        else if(position == 4)
        {
            setTitle("ঊপজেলা ও ঐতিহ্য");
            T2.setText(R.string.UpazillaandOitijjo);
        }
        else if(position == 5)
        {
            setTitle("ভাষা ও সংস্কৃতি");
            T2.setText(R.string.VashaandShongsKriti);
        }

    }
}
