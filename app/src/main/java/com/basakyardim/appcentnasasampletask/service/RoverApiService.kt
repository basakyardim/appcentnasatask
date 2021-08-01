package com.basakyardim.appcentnasasampletask.service

import com.basakyardim.appcentnasasampletask.model.RoverModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RoverApiService {

    private val baseUrl = "https://api.nasa.gov/mars-photos/api/v1/rovers/"
    private val apiKey = "sXNfsUhg8pgfFkW4zAy7ioNJ84pWjmIJ9CeB860u"
    private val api = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(RoverApi::class.java)

    fun getData(roverType:String,sol:Int,page:Int) : Single<RoverModel>{
        return api.getPhotos(roverType,sol,apiKey,page)
    }




}
