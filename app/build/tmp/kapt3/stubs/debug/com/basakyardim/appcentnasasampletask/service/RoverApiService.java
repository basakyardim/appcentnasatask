package com.basakyardim.appcentnasasampletask.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/basakyardim/appcentnasasampletask/service/RoverApiService;", "", "()V", "api", "Lcom/basakyardim/appcentnasasampletask/service/RoverApi;", "kotlin.jvm.PlatformType", "apiKey", "", "baseUrl", "getData", "Lio/reactivex/Single;", "Lcom/basakyardim/appcentnasasampletask/model/RoverModel;", "roverType", "sol", "", "page", "app_debug"})
public final class RoverApiService {
    private final java.lang.String baseUrl = "https://api.nasa.gov/mars-photos/api/v1/rovers/";
    private final java.lang.String apiKey = "sXNfsUhg8pgfFkW4zAy7ioNJ84pWjmIJ9CeB860u";
    private final com.basakyardim.appcentnasasampletask.service.RoverApi api = null;
    
    public RoverApiService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.basakyardim.appcentnasasampletask.model.RoverModel> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String roverType, int sol, int page) {
        return null;
    }
}