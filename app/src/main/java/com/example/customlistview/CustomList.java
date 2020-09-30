package com.example.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter< String > {

    private final Activity context;
    private final String[] name;
    private final Integer[] imageId;
    private final String[] chucvu;
    private final Integer[] hesoluong;
    public CustomList(Activity context, String[] name, Integer[] imageId, String[] chucvu, Integer[] hesoluong){
        super(context, R.layout.lsit_single, name);
        this.context = context;
        this.name=name;
        this.imageId = imageId;
        this.chucvu=chucvu;
        this.hesoluong=hesoluong;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent)
    {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.lsit_single, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.txt2);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(name[position]);
        txtTitle2.setText(chucvu[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;

    }
}
