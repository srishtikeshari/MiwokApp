package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivityActivity extends AppCompatActivity {
    MediaPlayer player;
    ArrayList<Word> words;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_activity);
        words = new ArrayList<Word>();
        words.add(new Word("Wetetti", "Red",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("chokokki", "Green",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("takaakki", "Brown",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("topoppi", "Gray",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("kululli", "Black",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("kelelli", "White",R.drawable.color_white,R.raw.color_white));
        words.add(new Word("topiisa", "Dusty Yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));

        Log.i("tag", "inserted");
        CustomWordAdapter itemsAdapter = new CustomWordAdapter(this,words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                player = MediaPlayer.create(ColorsActivityActivity.this, ((Word)words.get(i)).getSongResourceId());
                player.start();
            }
        });
    }
}