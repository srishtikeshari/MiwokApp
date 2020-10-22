package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivityActivity extends AppCompatActivity {
    MediaPlayer player;
    ArrayList<Word> words;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_activity);
        words = new ArrayList<Word>();
        words.add(new Word("Apa","Father",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("Eta","Mother",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("Angsi","Son" ,R.drawable.family_son,R.raw.family_son));
        words.add(new Word("Tune","Daughter",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("Taachi","Older Brother",R.drawable.family_older_brother,R.raw.family_older_brother ));
        words.add(new Word("Chailitti","Younger Borother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("Tete","Older Sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("Kolitti","Younger Sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("Ama","Grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("Paapa","Grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));
        Log.i("tag", "inserted");
        CustomWordAdapter itemsAdapter = new CustomWordAdapter(this,words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                player = MediaPlayer.create(FamilyActivityActivity.this, ((Word)words.get(i)).getSongResourceId());
                player.start();
            }
        });
    }
}