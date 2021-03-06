package com.hitesh.mvvmrx.api;

import com.hitesh.mvvmrx.model.AndroidVersionResposne;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface AndroidUserAPI {

    @GET("/versionapi.json")
    Observable<AndroidVersionResposne> getAndroidVersion();
}
