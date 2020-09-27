package com.lasiqueira.ffxivcharacterinfo.infrastructure.external.configuration;

import com.lasiqueira.ffxivcharacterinfo.infrastructure.external.client.XivApi;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;

import java.util.concurrent.TimeUnit;

@Configuration
public class RetrofitConfiguration {

    @Bean
    public OkHttpClient getOkHttpClient(@Value("${client.readtimeout}") final int readTimout, @Value("${client.connecttimeout}") final int connectTimeout) {
             return new OkHttpClient.Builder()
                .readTimeout(readTimout, TimeUnit.SECONDS)
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                .build();
    }

    @Bean
    public XivApi getXivApi(@Value("${xivapi.url}") String url, OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .build();

        return  retrofit.create(XivApi.class);
    }
}
