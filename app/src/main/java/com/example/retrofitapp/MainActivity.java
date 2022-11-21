package com.example.retrofitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private PostService mPostService = RetrofitClient.createService( PostService.class );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Call<List<PostEntity>> call = this.mPostService.list(); //Intanciou
        call.enqueue( new Callback<List<PostEntity>>() {
            @Override
            public void onResponse(Call<List<PostEntity>> call, Response<List<PostEntity>> response) {
                List<PostEntity> list = response.body();
                String a = "";
            }

            @Override
            public void onFailure(Call<List<PostEntity>> call, Throwable t) {
                //Falha
            }
        } );
    }
}