package com.basakyardim.appcentnasasampletask.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/basakyardim/appcentnasasampletask/viewmodel/CuriosityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiService", "Lcom/basakyardim/appcentnasasampletask/service/RoverApiService;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "roversLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/basakyardim/appcentnasasampletask/model/Photo;", "getRoversLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getRoversFromApi", "", "app_debug"})
public final class CuriosityViewModel extends androidx.lifecycle.ViewModel {
    private final com.basakyardim.appcentnasasampletask.service.RoverApiService apiService = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.basakyardim.appcentnasasampletask.model.Photo>> roversLiveData = null;
    
    public CuriosityViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.basakyardim.appcentnasasampletask.model.Photo>> getRoversLiveData() {
        return null;
    }
    
    public final void getRoversFromApi() {
    }
}