package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivityActivity extends AppCompatActivity {
    MediaPlayer player;
    ArrayList<Word> words;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_activity);
        words = new ArrayList<Word>();
        words.add(new Word("minto wuksus", "Where are you going?",R.raw.phrase_where_are_you_going));
        words.add(new Word("tinnә oyaase'nә", "What is your name?",R.raw.phrase_what_is_your_name));
        words.add(new Word("oyaaset..", "My name is...",R.raw.phrase_my_name_is));
        words.add(new Word("michәksәs?", "How are you feeling?",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("kuchi achit", "I’m feeling good.",R.raw.phrase_im_feeling_good));
        words.add(new Word("әәnәs'aa?", "Are you coming?",R.raw.phrase_are_you_coming));
        words.add(new Word("hәә’ әәnәm", "Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        words.add(new Word("әәnәm", "I’m coming.",R.raw.phrase_im_coming));
        words.add(new Word("yoowutis", "Let’s go.",R.raw.phrase_lets_go));
        words.add(new Word("әnni'nem", "Come here.",R.raw.phrase_come_here));
        Log.i("tag", "inserted");
        CustomWordAdapter itemsAdapter = new CustomWordAdapter(this,words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                player = MediaPlayer.create(PhrasesActivityActivity.this, ((Word)words.get(i)).getSongResourceId());
                player.start();
            }
        });
    }
}