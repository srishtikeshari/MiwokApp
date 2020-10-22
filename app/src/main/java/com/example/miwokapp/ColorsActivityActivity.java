package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_activity);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Wetetti", "Red",R.drawable.color_red));
        words.add(new Word("chokokki", "Green",R.drawable.color_green));
        words.add(new Word("takaakki", "Brown",R.drawable.color_brown));
        words.add(new Word("topoppi", "Gray",R.drawable.color_gray));
        words.add(new Word("kululli", "Black",R.drawable.color_black));
        words.add(new Word("kelelli", "White",R.drawable.color_white));
        words.add(new Word("topiisa", "Dusty Yellow",R.drawable.color_dusty_yellow));

        Log.i("tag", "inserted");
        CustomWordAdapter itemsAdapter = new CustomWordAdapter(this,words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}