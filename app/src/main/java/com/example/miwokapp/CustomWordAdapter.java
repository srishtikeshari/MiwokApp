package com.example.miwokapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class CustomWordAdapter extends ArrayAdapter<Word> {
    private int colorResource;

    public CustomWordAdapter(Activity context, ArrayList<Word> words, int colorResource)
    {
        super(context, 0, words);
        this.colorResource = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokname = (TextView)listItemView.findViewById(R.id.miwokname);
        miwokname.setText(currentWord.getMiwok());
        TextView englishname = (TextView)listItemView.findViewById(R.id.englishname);
        englishname.setText(currentWord.getEnglish());
        ImageView word_image = (ImageView)listItemView.findViewById(R.id.word_image);
        if(currentWord.hasImage()) {
            word_image.setImageResource(currentWord.getImageResourceId());
            word_image.setVisibility(View.VISIBLE);
        }
        else
        {
            word_image.setVisibility(View.GONE);
        }
        MediaPlayer player = MediaPlayer.create(getContext(), currentWord.getSongResourceId());
        View textContainer = (View)listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), colorResource);
        textContainer.setBackgroundColor(color);
        return listItemView;

    }



}
