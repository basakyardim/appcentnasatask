package com.basakyardim.appcentnasasampletask.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\bH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/basakyardim/appcentnasasampletask/service/RoverApi;", "", "getPhotos", "Lio/reactivex/Single;", "Lcom/basakyardim/appcentnasasampletask/model/RoverModel;", "rover_type", "", "sol", "", "api_key", "page", "app_debug"})
public abstract interface RoverApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{rover_type}/photos")
    public abstract io.reactivex.Single<com.basakyardim.appcentnasasampletask.model.RoverModel> getPhotos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "rover_type")
    java.lang.String rover_type, @retrofit2.http.Query(value = "sol")
    int sol, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @retrofit2.http.Query(value = "page")
    int page);
}