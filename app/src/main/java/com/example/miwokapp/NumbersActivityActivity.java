package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivityActivity extends AppCompatActivity {


    MediaPlayer player;
    ArrayList<Word> words;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_activity);
        words = new ArrayList<Word>();
        words.add(new Word("Lutti", "One", R.drawable.number_one,R.raw.number_one));
        words.add(new Word("Otiiko", "Two",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("Tolookosu", "Three",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("Oyyisa", "Four",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("Masokka", "Five",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("Temokka", "Six",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("Kanekaku", "Seven",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("Ekawinta", "Eight",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("Wo'e", "Nine",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("na'aacha", "Ten",R.drawable.number_ten,R.raw.number_ten));
        Log.i("tag", "inserted");
        CustomWordAdapter itemsAdapter = new CustomWordAdapter(this,words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                player = MediaPlayer.create(NumbersActivityActivity.this, ((Word)words.get(i)).getSongResourceId());
                player.start();
            }
        });

        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        for(int i = 0; i < numbers.length; i++)
        {
            TextView newText = new TextView(this);
            newText.setText((String)words.get(i));
            rootView.addView(newText);
        }*/
    }
}