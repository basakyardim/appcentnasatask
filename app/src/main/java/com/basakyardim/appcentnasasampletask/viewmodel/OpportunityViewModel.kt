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

class OpportunityViewModel : ViewModel() {

    private val apiService = RoverApiService()
    private val disposable = CompositeDisposable()

    val roversOpportunityLiveData = MutableLiveData<List<Photo>>()


    fun getRoversOpportunityFromApi(page:Int){
        disposable.add(
            apiService.getData("opportunity",1000,page)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<RoverModel>(){
                    override fun onSuccess(t: RoverModel) {
                        roversOpportunityLiveData.value = t.photos
                    }

                    override fun onError(e: Throwable) {
                    }

                })
        )
    }
}