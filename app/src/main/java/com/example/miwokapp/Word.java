package com.example.miwokapp;

import android.content.Context;
import android.media.Image;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Word {

    private String miwok;
    private String english;
    public final static int NO_IMAGE = -1;
    private int imageResourceId = NO_IMAGE;
    private int songResourceId;
    public Word(String miwok, String english, int imageResourceId, int songResourceId){
            this.miwok = miwok;
            this.english = english;
            this.imageResourceId = imageResourceId;
            this.songResourceId = songResourceId;
    }
    public Word(String miwok, String english, int songResourceId){
        this.miwok = miwok;
        this.english = english;
        this.songResourceId = songResourceId;
    }
    public String getMiwok()
    {
        return miwok;
    }
    public String getEnglish()
    {
        return english;
    }
    public int getImageResourceId()
    {
        return imageResourceId;
    }
    public int getSongResourceId()
    {
        return songResourceId;
    }
    public boolean hasImage()
    {
        return imageResourceId != NO_IMAGE;
    }
}
