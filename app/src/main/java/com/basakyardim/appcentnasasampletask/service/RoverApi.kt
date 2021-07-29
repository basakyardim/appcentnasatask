package com.basakyardim.appcentnasasampletask.service

import com.basakyardim.appcentnasasampletask.model.RoverModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RoverApi {

    @GET("{rover_type}/photos")
    fun getPhotos(@Path("rover_type") rover_type:String,@Query("sol") sol:Int, @Query("api_key") api_key:String, @Query("page") page:Int) : Single<RoverModel>
}