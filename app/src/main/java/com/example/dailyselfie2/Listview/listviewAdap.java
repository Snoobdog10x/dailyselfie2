package com.example.dailyselfie2.Listview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dailyselfie2.R;

import java.util.ArrayList;

public class listviewAdap extends ArrayAdapter<listview>{

    public listviewAdap(Context context, ArrayList<listview> list) {
        super(context, R.layout.activity_listview, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        listview listview = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_listview, parent, false);
        }
        TextView textView= convertView.findViewById(R.id.viewtext);
        ImageView imageView= convertView.findViewById(R.id.viewimg);
        textView.setText(listview.getName());
        Bitmap bmImg = BitmapFactory.decodeFile(listview.getPath());
        imageView.setImageBitmap(bmImg);
        return convertView;
    }
}
