package com.basakyardim.appcentnasasampletask.model

data class Photo(
    val camera: Camera,
    val earth_date: String,
    val id: Int,
    var img_src: String,
    val rover: Rover,
    val sol: Int
)