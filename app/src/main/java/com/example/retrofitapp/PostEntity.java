package com.example.retrofitapp;

import com.google.gson.annotations.SerializedName;

public class PostEntity {

    @SerializedName( "userId" )
    private int userId;

    @SerializedName( "Id" )
    private int id;

    @SerializedName( "title" )
    private String title;

    @SerializedName( "body" )
    private String body;


}
