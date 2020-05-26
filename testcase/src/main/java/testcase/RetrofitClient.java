package testcase;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit client = null;

    private RetrofitClient() {

    }

    public static Retrofit getRetrofit() {
        if (client == null)
            client = new Retrofit.Builder().baseUrl("https://batdemir-mytodoapi.azurewebsites.net/")
                    .addConverterFactory(GsonConverterFactory.create()).build();
        return client;
    }
}