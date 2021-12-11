package com.example.dailyselfie2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class openimg extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bigimg);
        Intent intent=getIntent();
        ImageView imageView=(ImageView) findViewById(R.id.bigimg);
        String path=intent.getStringExtra("path");
        Bitmap bmImg = BitmapFactory.decodeFile(path);
        imageView.setImageBitmap(bmImg);
    }
}
