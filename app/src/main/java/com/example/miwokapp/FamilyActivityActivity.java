package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_activity);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Apa","Father",R.drawable.family_father));
        words.add(new Word("Eta","Mother",R.drawable.family_mother));
        words.add(new Word("Angsi","Son" ,R.drawable.family_son));
        words.add(new Word("Tune","Daughter",R.drawable.family_daughter));
        words.add(new Word("Taachi","Older Brother",R.drawable.family_older_brother ));
        words.add(new Word("Chailitti","Younger Borother",R.drawable.family_younger_brother));
        words.add(new Word("Tete","Older Sister",R.drawable.family_older_sister));
        words.add(new Word("Kolitti","Younger Sister",R.drawable.family_younger_sister));
        words.add(new Word("Ama","Grandmother",R.drawable.family_grandmother));
        words.add(new Word("Paapa","Grandfather",R.drawable.family_grandfather));
        Log.i("tag", "inserted");
        CustomWordAdapter itemsAdapter = new CustomWordAdapter(this,words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}