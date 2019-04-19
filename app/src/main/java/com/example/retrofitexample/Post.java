package com.example.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int id;
    private String title;

    @SerializedName("body")
    private String text;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
