package com.example.nochiketa.mirsharaiinfo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nochiketa on 9/22/2017.
 */

public class GridViewImageAdapter extends ArrayAdapter<String> {
    private final Activity con;
    private final String[] names;
    private final Integer[] img;

    public GridViewImageAdapter(Activity con, String[] names, Integer[] img) {
        super(con, R.layout.grid_item, names);
        this.con = con;
        this.names = names;
        this.img = img;
    }

    public View getView(int position, View view, ViewGroup viewGroup){
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.grid_item, null, true);

        TextView textView = (TextView) rowView.findViewById(R.id.TextView_Grid);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.ImageView_Grid);

        textView.setText(names[position]);
        imageView.setImageResource(img[position]);

        return rowView;
    }
}
