package com.example.mcs.ostmoderncode;

import rx.Observable;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("?slug=home")
    Observable<ShowList> getResponse();
}
