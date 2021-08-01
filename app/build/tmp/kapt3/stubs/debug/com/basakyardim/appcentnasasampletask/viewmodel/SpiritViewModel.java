package com.basakyardim.appcentnasasampletask.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/basakyardim/appcentnasasampletask/viewmodel/SpiritViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiService", "Lcom/basakyardim/appcentnasasampletask/service/RoverApiService;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "roversSpiritLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/basakyardim/appcentnasasampletask/model/Photo;", "getRoversSpiritLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getRoversSpiritFromApi", "", "page", "", "app_debug"})
public final class SpiritViewModel extends androidx.lifecycle.ViewModel {
    private final com.basakyardim.appcentnasasampletask.service.RoverApiService apiService = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.basakyardim.appcentnasasampletask.model.Photo>> roversSpiritLiveData = null;
    
    public SpiritViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.basakyardim.appcentnasasampletask.model.Photo>> getRoversSpiritLiveData() {
        return null;
    }
    
    public final void getRoversSpiritFromApi(int page) {
    }
}