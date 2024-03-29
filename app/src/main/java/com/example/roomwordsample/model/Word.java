package com.example.roomwordsample.model;

import androidx.annotation.*;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    public String mWord;

    public Word(@NonNull String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}
}
