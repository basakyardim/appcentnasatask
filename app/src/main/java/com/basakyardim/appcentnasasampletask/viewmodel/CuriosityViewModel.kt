package com.basakyardim.appcentnasasampletask.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.basakyardim.appcentnasasampletask.model.Photo
import com.basakyardim.appcentnasasampletask.model.RoverModel
import com.basakyardim.appcentnasasampletask.service.RoverApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class CuriosityViewModel : ViewModel() {

    private val apiService = RoverApiService()
    private val disposable = CompositeDisposable()

    val roversLiveData = MutableLiveData<List<Photo>>()

    fun getRoversFromApi(){
        disposable.add(
            apiService.getData("curiosity",1000,1)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<RoverModel>(){
                    override fun onSuccess(t: RoverModel) {
                        roversLiveData.value = t.photos
                    }

                    override fun onError(e: Throwable) {
                    }

                })
        )
    }
}