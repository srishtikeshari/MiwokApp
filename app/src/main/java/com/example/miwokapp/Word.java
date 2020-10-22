package com.example.miwokapp;

import android.content.Context;

public class Word {

    private String miwok;
    private String english;
    public final static int NO_IMAGE = -1;
    private int imageResourceId = NO_IMAGE;
    public Word(String miwok, String english, int imageResourceId){
            this.miwok = miwok;
            this.english = english;
            this.imageResourceId = imageResourceId;
    }
    public Word(String miwok, String english){
        this.miwok = miwok;
        this.english = english;
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
    public boolean hasImage()
    {
        return imageResourceId != NO_IMAGE;
    }
}
