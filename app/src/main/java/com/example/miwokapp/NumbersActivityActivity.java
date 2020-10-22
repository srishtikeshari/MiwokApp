package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_activity);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Lutti", "One", R.drawable.number_one));
        words.add(new Word("Otiiko", "Two",R.drawable.number_two));
        words.add(new Word("Tolookosu", "Three",R.drawable.number_three));
        words.add(new Word("Oyyisa", "Four",R.drawable.number_four));
        words.add(new Word("Masokka", "Five",R.drawable.number_five));
        words.add(new Word("Temokka", "Six",R.drawable.number_six));
        words.add(new Word("Kanekaku", "Seven",R.drawable.number_seven));
        words.add(new Word("Ekawinta", "Eight",R.drawable.number_eight));
        words.add(new Word("Wo'e", "Nine",R.drawable.number_nine));
        words.add(new Word("na'aacha", "Ten",R.drawable.number_ten));
        Log.i("tag", "inserted");
        CustomWordAdapter itemsAdapter = new CustomWordAdapter(this,words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        /*LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        for(int i = 0; i < numbers.length; i++)
        {
            TextView newText = new TextView(this);
            newText.setText((String)words.get(i));
            rootView.addView(newText);
        }*/
    }
}