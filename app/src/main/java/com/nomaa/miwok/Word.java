package com.nomaa.miwok;

import java.util.ArrayList;

/**
 * Created by nomaa on 4/6/2017.
 */

public class Word {
    private String english;
    private String miwok;
    private int imageResourceID;
    private int audioResourceID;

    public Word(String eng, String miw, int imgResID, int audioResID){
        english = eng;
        miwok = miw;
        imageResourceID = imgResID;
        audioResourceID = audioResID;
    }

    public String getEnglish(){
        return english;
    }

    public String getMiwok(){
        return miwok;
    }

    public int getImageResourceID(){
        return imageResourceID;
    }

    public int getAudioResourceID(){
        return audioResourceID;
    }
}
