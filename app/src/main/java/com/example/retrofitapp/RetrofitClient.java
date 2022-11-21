package com.example.retrofitapp;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;

    private static Retrofit getRetrofitClient (){
        //Se o atributo retrofit for nulo;
        if(retrofit==null) {
            //Carrega as informações vindas da API;
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl( "https://jsonplaceholder.typicode.com" ) //Base da URL
                    .addConverterFactory( GsonConverterFactory.create() ) //Conversão dos dados da API
                    .build(); //Monta o body vindo do retrofit
        }
        return retrofit;

    }

    public static <S> S createService(Class<S> serviceClass){
        //S é um tipo genérico
        return getRetrofitClient().create( serviceClass );
    }
}
